object Solution {
  def intersection(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    (nums1 intersect nums2).distinct // intersect-пересечение всех чисел масовов, distinct-это уникальные числа этого пересечения
  }
}