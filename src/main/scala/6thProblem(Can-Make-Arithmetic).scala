object Solution {
  def canMakeArithmeticProgression(arr: Array[Int]): Boolean = {
    scala.util.Sorting.quickSort(arr)
    val dif = arr(1)-arr(0)
    var ok = true
    for(i <- 2 to arr.length-1){
      if(arr(i)-arr(i-1) != dif){
        ok = false
      }
    }
    ok
  }
}