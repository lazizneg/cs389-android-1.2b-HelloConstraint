# Android fundamentals 01.2 Part B and 01.4

### Answer these questions

#### Question 1

Which two layout constraint attributes on the Zero Button position it vertically equal distance between the other two Button elements? (Pick 2 answers.)

* app:layout_constraintBottom_toTopOf="@+id/button_count"
* - [x] android:layout_marginBottom="8dp"
* android:layout_marginStart="16dp"
* app:layout_constraintTop_toBottomOf="@+id/button_toast"
* - [x] android:layout_marginTop="8dp"

#### Question 2

Which layout constraint attribute on the Zero Button positions it horizontally in alignment with the other two Button elements?

* - [x] app:layout_constraintLeft_toLeftOf="parent"
* app:layout_constraintBottom_toTopOf="@+id/button_count"
* android:layout_marginBottom="8dp"
* app:layout_constraintTop_toBottomOf="@+id/button_toast"

#### Question 3 

What is the correct signature for a method used with the android:onClick XML attribute?

* public void callMethod()
* - [x] public void callMethod(View view)
* private void callMethod(View view)
* public boolean callMethod(View view)

#### Question 4

The click handler for the Count Button starts with the following method signature:


`
public void countUp(View view)
`

Which of the following techniques is more efficient to use within this handler to change the Button element's background color? Choose one:

* Use findViewById to find the Count Button. Assign the result to a View variable, and then use setBackgroundColor().
* - [x] Use the view parameter that is passed to the click handler with setBackgroundColor(): view.setBackgroundColor()


#### Question 1

Question 1
Within an Android Studio project, what menu command can you use to open the list of sample apps? Choose one:

* File > Open
* - [x] File > New > Import Sample
* File > New > Import Module
* File > New > Import Project

#### Question 2

Which buttons does the Basic Activity template provide as part of the UI? Choose two:

* Navigation buttons
* - [x] Options menu overflow button
* - [x] Floating action button
* Button class button with the text "Button"

#### Question 3 

Which source of documentation is the official documentation for Android developers? Choose one:

* stackoverflow.com
* officialandroid.blogspot.com
* - [x] developer.android.com
* github.com

# Thank You.
