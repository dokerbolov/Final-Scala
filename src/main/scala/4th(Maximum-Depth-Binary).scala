import javax.swing.tree.TreeNode

object Solution {
  def maxDepth(root: TreeNode): Int = {
    var cnt = 0
    if(root != null){ // Если дерево пустое то значит 0, Если дерево есть то как минимум 1
      cnt = 1 + Math.max(maxDepth(root.left), maxDepth(root.right)) //Методы находят максумум лево и право идобавляют основу
    }
    cnt
  }
}