object Solution {
  def largestPerimeter(nums: Array[Int]): Int = {
    scala.util.Sorting.quickSort(nums)  // сортируем по возрастанию
    val len = nums.length-1
    var max = 0
    for (i <- 2 to len){
      if(nums(i) + nums(i-1) > nums(i-2) &&  // проверяем на А+Б>C
        nums(i) + nums(i-2) > nums(i-1) &&
        nums(i-2) + nums(i-1) > nums(i) &&
        max < nums(i) + nums(i-1) + nums(i-2)){
        max = nums(i) + nums(i-1) + nums(i-2) // Если действительно можно создать треугольник то выводим МАКС периметр
      }
    }
    max
  }
}