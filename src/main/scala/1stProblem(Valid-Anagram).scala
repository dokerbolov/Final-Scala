object Solution {
  def isAnagram(s: String, t: String): Boolean = {
    var bool = true
    var s1 = s.sorted
    var t1 = t.sorted
    if(s1 != t1){
      bool = false
    }
    bool
  }
}