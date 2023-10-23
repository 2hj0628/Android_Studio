package com.example.yolo_cam

import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import com.example.yolo_cam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var db : MemoDatabase
    var memoList = listOf<MemoEntity>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        db = MemoDatabase.getInstance(this)!!

    }

    //1. Insert Data
    fun insertMemo(memo: MemoEntity){
        //1. MainThread vs WorkerThread(Background Thread)

    }

    //2. Get Data
    fun getAllMemos(){

    }

    //3. Delete Data
    fun deleteMemo(){

    }

    //4. Set RecyclerView
    fun setRecyclerView(){

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action){
            MotionEvent.ACTION_DOWN -> {
                Log.d("kkang", "Touch down event")
                Log.d("kkang", "Touch down event x: ${event.x}, rawX: ${event.rawX}")
                Log.d("kkang", "Touch down event y: ${event.y}, rawY: ${event.rawY}")
            }
            MotionEvent.ACTION_UP -> {
                Log.d("kkang", "Touch up event")
            }
        }
        return super.onTouchEvent(event) // 사용자 구현코드 실행후 default 부모메서드 코드 실행
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when(keyCode){
            // 키 이벤트 처리가 가능한 3 가지
            KeyEvent.KEYCODE_BACK -> Log.d("kkang", "뒤로가기 버튼을 누름")
            KeyEvent.KEYCODE_VOLUME_UP -> Log.d("kkang", "볼륨업 버튼을 누름")
            KeyEvent.KEYCODE_VOLUME_DOWN -> Log.d("kkang", "볼륨다운 버튼을 누름")
        }
        return super.onKeyDown(keyCode, event)
    }
}

