object Solution extends App{
  def isAnagram(s: String, t: String): Boolean = {
    var bool = true
    var s1 = s.sorted //Сортируем по алфавиту
    var t1 = t.sorted
    if(s1 != t1){    //Если они одинаковые то это анаграмма
      bool = false
    }
    bool
  }

    def maximumUnits(boxTypes: Array[Array[Int]], truckSize: Int): Int = {
      var output = 0
      var count = 0

      var sortedBox = boxTypes.sortBy(_(1))

      for (i <- sortedBox.indices){
        var num = sortedBox(i)(0)
        var unit = sortedBox(i)(1)

        while(count < truckSize && num > 0){
          output = output + unit
          num = num - 1
          count = count + 1
        }
      }
      output
    }




}