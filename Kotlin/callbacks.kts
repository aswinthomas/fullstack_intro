class Button {
    // a common way to handle callback code is to set property on another class
    private var clickListener: OnClickListener? = null

    fun performClick() {
        println("In the button perfom click function")
        // this is where the callback happens
        clickListener?.onClick()
    }

    // provide the callback code
    fun setOnClickListener(listener: OnClickListener) {
        clickListener = listener
    }
}

val myButton = Button()
myButton.performClick()

interface OnClickListener {
    fun onClick() {

    }
}

myButton.setOnClickListener(object: OnClickListener {
    override fun onClick() {
        println("Now we are in the callback code")
    }
})

myButton.performClick()