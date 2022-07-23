package com.example.ch7_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


/*
* 1. LinearLayout - 선형으로 배치
* -> 뷰를 가로나 세로 방향으로 나열하는 레이아웃 클래스
* android:orientation -> vertical : 세로 방향, horizontal : 가로 방향
* + LinearLayout을 중첩해서 사용하면 가로세로가 중첩된 구조로 만들 수 있음
*
* android:layout_weight -> 여백을 뷰로 채움
* -> 비율을 값으로 줘서 비율대로 여백을 채울 수 있음
*
* android:gravity -> 콘텐츠를 대상으로 정렬
* -> ex. "right|bottom" 으로 할시 콘텐츠가 우측 하단에 정렬 됨
*
* android:layout_gravity -> 뷰 자체를 정렬하는 속성
* -> ex. "center_horizontal" 으로 할시 뷰 자체가 가로로 가운데 표시
*
*
* 2. RelativeLayout - 상대 위치로 배치
* -> 이미 출력된 특정 뷰를 기준으로 방향으로 지정하여 배치
* android:layout_above -> 기준 뷰의 위쪽에 배치
* android:layout_below -> 기준 뷰의 아래쪽에 배치
* android:layout_toLeftOf -> 기준 뷰의 왼쪽에 배치
* android:layout_toRightOf -> 기준 뷰의 오른쪽에 배치
* ex. ImageView에 id 값을 지정 -> Button에 위쪽 속성을 이용하여 id값에 상대 배치
*
* android:layout_alignTop -> 기준 뷰와 위쪽에 맞춤
* android:layout_alignBottom -> 기준 뷰와 아래쪽을 맞춤
* android:layout_alignLeft -> 기준 뷰와 왼쪽을 맞춤
* android:layout_alignRight -> 기준 뷰와 오른쪽을 맞춤
* android:layout_alignBaseLine -> 기준 뷰와 텍스트 기준선을 맞춤
* ex. 사용 방법은 위와 같음
*
* 그 밖에 뷰를 부모 영역에 상대적인 배치를 할 경우
* android:layout_alignParentTop
* android:layout_alignParentBottom
* android:layout_alignParentLeft
* android:layout_alignParentRight
* android:layout_centerHorizontal
* android:layout_centerVertical
* android:layout_centerInParent
* 의 속성이 있으며 속성 값은 "true"로 주면 됨
*
*
* 3. FrameLayout - 겹쳐서 배치
* -> 뷰를 겹쳐서 출력하는 레이아웃 클래스
* -> 보통 visibility 속성을 invisible 속성으로 지정 후 이벤트나 조건에 의해 속성 값을 바꿈
*
*
* 4. GridLayout - 표 형태로 배치
* -> 행과 열로 구성된 테이블 화면을 만드는 레이아웃 클래스
* -> LinearLayout과 유사하지만 줄바꿈을 자동으로 해줌
*
* android:orientation -> 가로, 수직을 지정
*
* android:columnCount, android:rowCount -> 값에 따라 뷰의 갯수를 출력하고 줄바꿈을 진행
*
* android:layout_row, android:layout_column -> 특정 뷰의 위치를 조정할 수 있음
*
* android:layout_gravity -> "fill_horizontal" 등의 값을 추가 시 특정 뷰를 확장해서 출력 가능
*
* android:layout_columnSpan, android:layout_rowSpan -> 열이나 행 병합하기
*
*
* 5. ConstraintLayout - 계층 구조로 배치
* -> 안드로이드 플랫폼이 아닌 androidx에서 제공하는 라이브러리
* -> 먼저 사용을 위해서 build.gradle 에서 implementation 'androidx.constraintlayout:constraintlayout:2.1.1" 작성
* -> 레이아웃 편집기에서 레이아웃을 구성
* -> 중요한 포인트는 제약 조건을 지정해줘야함
*
*
*
*
*
* */