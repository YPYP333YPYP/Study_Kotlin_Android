package com.example.ch6_view

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        // 이름 문자열 출력 TextView 생성
//        val name = TextView(this).apply{
//            typeface = Typeface.DEFAULT_BOLD
//            text = "String"
//        }
//
//        // 이미지 출력 ImageView 생성
//        val address = ImageView(this).also{
//            it.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.image_1))
//        }
//
//        var layout = LinearLayout(this).apply {
//            orientation = LinearLayout.VERTICAL
//            gravity = Gravity.CENTER
//            // LinearLayout 객체에 TextView, ImageView 객체 추가
//            addView(name , WRAP_CONTENT, WRAP_CONTENT)
//            addView(image , WRAP_CONTENT, WRAP_CONTENT)
//        }

//        // LinearLayout 객체를 화면에 출력력
//        setContentView(R.layoutactivity_main)
    }
}

/*
* 안드로이드 앱의 기본 구조 - 컴포넌트 기반
* 액티비티 서비스, 브로드캐스트 리시버, 콘텐츠 프로바이더와 같은 컴포넌트의 조합으로 생성
*
* 이 중에서 화면을 출력하는 컴포넌트는 '액티비티' 뿐임
*
* 액티비티에서 뷰로 화면을 구성하는 방법은 2가지
* 1. 액티비티 코드로 작성
* 2. 레이아웃 XML 파일로 작성
*
*
* 1. 액티비티 코드로 화면 구성 (위의 내용)
* MainActivity.kt 파일에 작성
*
*
* 2. 레이아웃 XML 파일 작성
* activity_main.xml 파일에 작성
*
* 액티비티에 화면을 구성할 때 사용하는 클래스는 모두 View 의 하위 클래스
* 보통 레이아웃 클래스에 뷰를 포함
*
* 레이아웃끼리 중첩 가능
* 이런식의 객체를 계층 구조로 만드는 것을 컴포지트 패턴 혹은 문서 객체 모델이라고 칭함
*
* XML -> kt 파일로 사용할땐
* XML의 View 객체에
* andrioid:id = '@+id/id값" 을 부여해서
*
* val 객체 = findViewById(R.id.id값) 으로 사용
*
* View의 속성 파악
* 1. android:layout_width, android:layout_height
* wrap_content -> 화면에 출력할 수 있는 적절한 크기
* match_parent -> 부모의 크기 전체
*
* 2. android:padding, android:layout_marginLeft
* margin -> 뷰와 뷰 사이의 간격
* padding -> 뷰의 콘텐츠와 테두리 사이의 간격
*
* 3. android:visibility
* visible -> 보임
* invisible -> 안보임, 자리 차지
* gone -> 안보임, 자리도 안차지
*
* 4. 텍스트 뷰
* - android:text -> 출력할 문자열 지정
* - android:textColor -> 문자열의 색상 지정
* - android:textSize -> 문자열의 크기 지정
* - android:textStyle -> 문자열의 스타일 지정
* - android:autoLink -> 특정 형태의 문자열에 자동 링크를 추가
* - android:maxLines -> 자동으로 줄바꿈 해줌
* - android:ellipsize -> 내용을 줄이고 ...로 표시
*
* 5. 이미지 뷰
* - android:src -> 출력할 이미지 설정
* - android:maxWidth, android:Height -> 출력하는 이미지의 최대 크기 지정
* - android:adjustViewBounds -> 이미지의 가로세로 길이와 비례해 뷰의 크기를 맞춤
*
* 6. 버튼, 체크박스, 라디오 박스
*
* 7. 에디트 텍스트
* - android:lines, android:maxLines -> 입력받는 크기 기본 1줄, maxLines로 늘릴 수 있음
* - android:inputType -> 여러 속성을 가짐
*
* 8. 뷰바인딩
* 그래들 파일에 뷰 바인딩 설정
* viewBinding = true로 설정하면
* XML 파일에 등록된 뷰 객체를 포함하는 클래스가 자동으로 만들어짐
* 자동으로 만들어진 클래스의 inflate() 함수를 호출하면 바인딩 객체를 얻을 수 있음
*
*
* */