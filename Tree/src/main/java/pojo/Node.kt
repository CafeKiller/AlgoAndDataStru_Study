package pojo

class Node: Comparable<Node>{

    var value: Int = 0
    var left: Node? = null
    var right: Node? = null

    constructor(value: Int){
        this.value = value
    }

    override fun toString(): String {
        return "Node(value=$value, left=$left, right=$right)"
    }

    override fun compareTo(other: Node): Int {
        return this.value - other.value
    }

    fun preOrder() {
        println(this)
        if (this.left != null){
            this.left!!.preOrder()
        }
        if (this.right != null){
            this.right!!.preOrder()
        }


    }

}