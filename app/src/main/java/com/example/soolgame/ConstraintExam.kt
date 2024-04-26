package com.example.soolgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintSet

class ConstraintExam : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_exam)

        // ConstraintSet 객체 생성
        val constraintSet = ConstraintSet()

// ConstraintSet에 뷰들의 제약 조건 설정
//        constraintSet.constrainWidth(R.id.button, ConstraintSet.WRAP_CONTENT)
//        constraintSet.constrainHeight(R.id.button, ConstraintSet.WRAP_CONTENT)
//        constraintSet.connect(R.id.button, ConstraintSet.TOP, R.id.textView, ConstraintSet.BOTTOM, 16)
//        constraintSet.connect(R.id.button, ConstraintSet.START, R.id.parent, ConstraintSet.START, 16)
//        constraintSet.connect(R.id.button, ConstraintSet.END, R.id.parent, ConstraintSet.END, 16)
//
//// ConstraintSet 적용
//        constraintSet.applyTo(parentLayout)
    }
}