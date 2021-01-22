package kr.khs.studyfarm.view.custom

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kr.khs.studyfarm.R

class LevelSelectButton @JvmOverloads constructor(
    context : Context, attrs : AttributeSet? = null, defStyle: Int = 0
) : ConstraintLayout(context, attrs, defStyle) {

    private val dotCount = 4

    private lateinit var btnLevelOne : ImageView
    private lateinit var btnLevelTwo : ImageView
    private lateinit var btnLevelThree : ImageView
    private lateinit var btnLevelFour : ImageView

    private lateinit var textLevelOne : TextView
    private lateinit var textLevelTwo : TextView
    private lateinit var textLevelThree : TextView
    private lateinit var textLevelFour : TextView

    private lateinit var lineOne : View
    private lateinit var lineTwo : View
    private lateinit var lineThree : View

    private var levelOneName = "Level 1"
    private var levelTwoName = "Level 2"
    private var levelThreeName = "Level 3"
    private var levelFourName = "Level 4"

    private var selectNumber = 0

    init {
        val inflaterService = Context.LAYOUT_INFLATER_SERVICE
        val layoutInflater = getContext().getSystemService(inflaterService) as LayoutInflater
        val view = layoutInflater.inflate(R.layout.button_level_select, this, false)
        addView(view)

        initViews()
        initAttrs(attrs)
        initSettings()
    }

    private fun initViews() {
        btnLevelOne = findViewById(R.id.levelselect_button_level1)
        btnLevelTwo = findViewById(R.id.levelselect_button_level2)
        btnLevelThree = findViewById(R.id.levelselect_button_level3)
        btnLevelFour = findViewById(R.id.levelselect_button_level4)

        textLevelOne = findViewById(R.id.levelselect_tv_level1)
        textLevelTwo = findViewById(R.id.levelselect_tv_level2)
        textLevelThree = findViewById(R.id.levelselect_tv_level3)
        textLevelFour = findViewById(R.id.levelselect_tv_level4)

        lineOne = findViewById(R.id.levelselect_line1)
        lineTwo = findViewById(R.id.levelselect_line2)
        lineThree = findViewById(R.id.levelselect_line3)
    }

    private fun initAttrs(attrs : AttributeSet?) {
        attrs?.run {
            context.obtainStyledAttributes(this, R.styleable.LevelSelectButton)
        }?.run {
            levelOneName = getString(R.styleable.LevelSelectButton_levelOneName) ?: levelOneName
            levelTwoName = getString(R.styleable.LevelSelectButton_levelOneName) ?: levelTwoName
            levelThreeName = getString(R.styleable.LevelSelectButton_levelOneName) ?: levelThreeName
            levelFourName = getString(R.styleable.LevelSelectButton_levelOneName) ?: levelFourName
        }
    }

    private fun initSettings() {
        textLevelOne.text = levelOneName
        textLevelTwo.text = levelTwoName
        textLevelThree.text = levelThreeName
        textLevelFour.text = levelFourName

        btnLevelOne.setOnClickListener { btnClick(1) }
        btnLevelTwo.setOnClickListener { btnClick(2) }
        btnLevelThree.setOnClickListener { btnClick(3) }
        btnLevelFour.setOnClickListener { btnClick(4) }
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun btnClick(idx : Int) {

        selectNumber = idx

        btnLevelOne.background = resources.getDrawable(
            if(idx == 1)
                R.drawable.custom_circle_select_o
            else
                R.drawable.custom_circle_select_x,
            null)

        btnLevelTwo.background = resources.getDrawable(
            if(idx == 2)
                R.drawable.custom_circle_select_o
            else
                R.drawable.custom_circle_select_x,
            null)

        btnLevelThree.background = resources.getDrawable(
            if(idx == 3)
                R.drawable.custom_circle_select_o
            else
                R.drawable.custom_circle_select_x,
            null)

        btnLevelFour.background = resources.getDrawable(
            if(idx == 4)
                R.drawable.custom_circle_select_o
            else
                R.drawable.custom_circle_select_x,
            null)
    }

    fun getSelectLevel() = selectNumber
}

//class LevelSelectButton1 @JvmOverloads constructor(
//    context : Context, attrs : AttributeSet? = null, defStyle : Int = 0
//) : View(context, attrs, defStyle) {
//
//    private val dotCount = 4
//
//    private var levelOneName = "Level1"
//    private var levelTwoName = "Level2"
//    private var levelThreeName = "Level3"
//    private var levelFourName = "Level4"
//
//    private var lineColor = Color.CYAN
//    private var lineSize = 10.0f
//
//    private var dotSize = 20.0f
//
//    private var linePaint = Paint()
//
//    private var dotPaint = Paint()
//
//    init {
//        init(attrs)
//        setPaint()
//    }
//
//    private fun init(attrs : AttributeSet?) {
//        attrs?.run {
//            context.obtainStyledAttributes(this, R.styleable.LevelSelectButton)
//        }?.run {
//            levelOneName = getString(R.styleable.LevelSelectButton_levelOneName) ?: "Level 1"
//            levelTwoName = getString(R.styleable.LevelSelectButton_levelOneName) ?: "Level 2"
//            levelThreeName = getString(R.styleable.LevelSelectButton_levelOneName) ?: "Level 3"
//            levelFourName = getString(R.styleable.LevelSelectButton_levelOneName) ?: "Level 4"
//
//            lineColor = getColor(R.styleable.LevelSelectButton_lineColor, lineColor)
//            lineSize = getDimension(R.styleable.LevelSelectButton_lineSize, lineSize)
//
//            dotSize = getDimension(R.styleable.LevelSelectButton_dotSize, dotSize)
//        }
//
//    }
//
//    private fun setPaint() {
//        linePaint.run {
//            color = Color.GRAY
//            isAntiAlias = true
//            style = Paint.Style.FILL
//            strokeCap = Paint.Cap.ROUND
//            strokeJoin = Paint.Join.ROUND
//            strokeWidth = lineSize
//        }
//
//        dotPaint.run {
//            color = Color.GRAY
//            isAntiAlias = true
//            style = Paint.Style.FILL
//            strokeCap = Paint.Cap.ROUND
//            strokeJoin = Paint.Join.ROUND
//            strokeWidth = dotSize
//        }
//    }
//
//    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
//        val heightDimension = dotSize.toInt() * 2
//        setMeasuredDimension(widthMeasureSpec, heightDimension)
//    }
//
//    override fun onDraw(canvas: Canvas?) {
//        super.onDraw(canvas)
//
//        val dotSpacing = 20
//
//        val dotCount = dotCount
//        val dotAreaSize = (dotSize + dotSpacing) * dotCount
//
//        val startOffset = dotSize
//
//        val startXPos = startOffset + dotSpacing / 2f
//        val startYPos = measuredHeight / 2f
//
//        val drawOffset = (measuredWidth - dotSize * dotCount) / (dotCount - 1)
//
//        for(i in 0 until dotCount) {
//            val xPos = startXPos + drawOffset * i
//            val yPos = startYPos
//            canvas?.drawCircle(xPos, yPos, dotSize, dotPaint)
//            if(i > 1) {
//                val lineXPos = xPos + drawOffset * (i - 1)
//                val lineYPos = yPos + drawOffset * (i - 1)
//                canvas?.drawLine(lineXPos, lineYPos, xPos, yPos, linePaint)
//            }
//        }
//    }
//
//}