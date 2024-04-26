package com.example.soolgame

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.NumberPicker
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var TAG = "[MainActivity]";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate : activity created.")

        initial()
    } // onCreate end

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart : activity started.")
    } // onStart end

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onStart : activity resumed.")
    } // onResume end

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause : activity pause.")
    } // onPause end

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onPause : activity stopped.")
    } // onStop end

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onPause : activity died.")
    } // onDestroy end


    private fun initial() {
        Log.v(TAG, "initial method enter")
        setKingBtn()
        setLiarBtn()
    } // initial method end

    private fun setKingBtn() {
        Log.v(TAG, "setKingBtn method enter")
        val kingBtn: Button = findViewById(R.id.kingBtn)
        kingBtn.setOnClickListener(View.OnClickListener {
            // TODO - 인원 체크하는 다이얼로그 생성
//            val intent = Intent(this, King::class.java)
//            startActivity(intent)
        }) // kingBtn.setOnClickListener

    } // setKingBtn method end

    private fun setLiarBtn() {
        Log.v(TAG, "setLiarBtn method enter")
        var selectNum = 0;
        val liarBtn: Button = findViewById(R.id.liarBtn)

        liarBtn.setOnClickListener(View.OnClickListener {
            // TODO - 인원 체크하는 다이얼로그 생성
            val layout = layoutInflater.inflate(R.layout.dialog_num_select, null)
            val numberPicker: NumberPicker = layout.findViewById(R.id.number_picker);
            val build = AlertDialog.Builder(it.context).apply {
                setView(layout)
            } // apply end

            val dialog = build.create()
            dialog.show()

            numberPicker.minValue = 1
            numberPicker.maxValue = 6
            if (selectNum != 0) numberPicker.value = selectNum

            val btnCancel: Button = layout.findViewById(R.id.btn_cancel) // 취소 버튼
            btnCancel.setOnClickListener {
                dialog.dismiss()
            } // btnCancel.setOnClickListener end

            val btnOk: Button = layout.findViewById(R.id.btn_ok) // 확인 버튼
            btnOk.setOnClickListener {
                selectNum = numberPicker.value // 선택한 번호 저장
                Log.d(TAG, "[Number Picker] select number check : $selectNum")
                dialog.dismiss()

                val intent = Intent(this, Liar::class.java)
                intent.putExtra("selectNum", selectNum)
                startActivity(intent)
            } // btnOk.setOnClickListener end

        }) // liarBtn.setOnClickListener
    } // setLiarBtn method end

} // CLASS end