object Solution {
  def isAnagram(s: String, t: String): Boolean = {
    var bool = true
    var s1 = s.sorted //Сортируем по алфавиту
    var t1 = t.sorted
    if(s1 != t1){    //Если они одинаковые то это анаграмма
      bool = false
    }
    bool
  }
}