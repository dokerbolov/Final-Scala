object Solution {
  def largestPerimeter(nums: Array[Int]): Int = {
    scala.util.Sorting.quickSort(nums)
    val len = nums.length-1
    var max = 0
    for (i <- 2 to len){
      if(nums(i) + nums(i-1) > nums(i-2) &&
        nums(i) + nums(i-2) > nums(i-1) &&
        nums(i-2) + nums(i-1) > nums(i) &&
        max < nums(i) + nums(i-1) + nums(i-2)){
        max = nums(i) + nums(i-1) + nums(i-2)
      }
    }
    max
  }
}