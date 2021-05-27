import scala.util.control.Breaks._

// МОЕЙ ОШИБКОЙ БЫЛО ЧТО Я РАССМАТРИВАЛ ТОЛЬКО 3 РАЗА ПРОЦЕСС Increasing and Decreasing.
// Например в случае aaaabbbbcccc оно работает, abccba...
// Но если у нас есть aaabbbccccd то код ломается, abcdcbabc...
// Изза нехватки времени не успел дописать его

object Solution {
  def sortString(s: String): String = {
    var sol = ""
    val len = s.length
    var bool = true
    var s1 = s
    var perm = 0
    var perm2 = ""
    while(sol.length != len){ // Длина нового стринга не будет равна длине исходного стринга
      if(bool) { // Чекаем на Increasing or Decreasing
        s1 = s1.sorted
        perm2 = perm2 + s1(0) // Сохраняем первый элемент
        breakable(
          for (i <- 0 to s1.length - 1) {
            if (s1(0) < s1(i)) {
              perm2 = perm2 + s1(i) // Находим вторую букву которая больше первой и сохраняем
              perm = i // сохраняем индекс чтобы позже удалить
              break()
            }
          }
        )
        breakable(
          for (i <- 0 to s1.length - 1) {
            if (s1(0) < s1(i) && s1(i) > s1(perm)) { // Находим третью букву которая больше второй и первой
              perm2 = perm2 + s1(i) // сохраняем ее
              s1 = s1.substring(0, i) + s1.substring(i + 1, s1.length) // удаляем последнюю букву
              s1 = s1.substring(0, perm) + s1.substring(perm + 1, s1.length) // удаляем вторую букву
              s1 = s1.substring(1, s1.length) // удаляем первую букву
              break()
            }
          }
        )
        sol = sol + perm2 // Добавляем на нашу sol наший сохраненные буквы
        perm2 = ""
        bool = false // Переходим на Decreasing
      }
      else{ // Делаем все реверсивно для Decreasing как для Increasing
        s1 = s1.sorted.reverse
        perm2 = perm2 + s1(0)
        breakable(
          for (i <- 0 to s1.length - 1) {
            if (s1(0) > s1(i)) {
              perm2 = perm2 + s1(i)
              perm = i
              break()
            }
          }
        )
        breakable(
          for (i <- 0 to s1.length - 1) {
            if (s1(0) > s1(i) && s1(i) < s1(perm)) {
              perm2 = perm2 + s1(i)
              s1 = s1.substring(0, i) + s1.substring(i + 1, s1.length)
              s1 = s1.substring(0, perm) + s1.substring(perm + 1, s1.length)
              s1 = s1.substring(1, s1.length)
              break()
            }
          }
        )
        sol = sol + perm2
        perm2 = ""
        bool = true // Переходим обратно на Increasing
      }
    }
    sol
  }
}