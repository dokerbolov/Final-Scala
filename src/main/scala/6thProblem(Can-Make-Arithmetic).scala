object Solution {
  def canMakeArithmeticProgression(arr: Array[Int]): Boolean = {
    scala.util.Sorting.quickSort(arr) // Сортируем по востразтанию
    val dif = arr(1)-arr(0) // Находим разницу которая должна быть везде
    var ok = true
    for(i <- 2 to arr.length-1){ // пробигаемся по масиву, если разница гдето разная то выводим как False
      if(arr(i)-arr(i-1) != dif){
        ok = false
      }
    }
    ok
  }
}