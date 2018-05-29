package fr.castorflex.android.flipimageview.sample

import android.app.Activity
import android.os.Bundle
import fr.castorflex.android.flipimageview.R
import fr.castorflex.android.flipimageview.library.FlipImageView
import kotlinx.android.synthetic.main.main.*

class SampleActivity : Activity() {
    private val mListMenuButtons = mutableListOf<FlipImageView>()

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        initMenuButtonList()
        btn_select.setOnFlipListener(object : FlipImageView.SimpleOnFlipListener() {
            override fun onClick(view: FlipImageView?) {
                resetSelectedState(view!!)
            }
        })
        btn_pen.setOnFlipListener(object : FlipImageView.SimpleOnFlipListener() {
            override fun onClick(view: FlipImageView?) {
                resetSelectedState(view!!)
            }
        })
        btn_shape.setOnFlipListener(object : FlipImageView.SimpleOnFlipListener() {
            override fun onClick(view: FlipImageView?) {
                resetSelectedState(view!!)
            }
        })
        btn_eraser.setOnFlipListener(object : FlipImageView.SimpleOnFlipListener() {
            override fun onClick(view: FlipImageView?) {
                resetSelectedState(view!!)
            }
        })
        btn_tools.setOnFlipListener(object : FlipImageView.SimpleOnFlipListener() {
            override fun onClick(view: FlipImageView?) {
                resetSelectedState(view!!)
            }
        })
        btn_menu.setOnFlipListener(object : FlipImageView.SimpleOnFlipListener() {
            override fun onClick(view: FlipImageView?) {
                resetSelectedState(view!!)
            }
        })
    }

    private fun initMenuButtonList() {
        mListMenuButtons.add(btn_select)
        mListMenuButtons.add(btn_pen)
        mListMenuButtons.add(btn_shape)
        mListMenuButtons.add(btn_eraser)
        mListMenuButtons.add(btn_tools)
        mListMenuButtons.add(btn_menu)
    }

    private fun resetSelectedState(view: FlipImageView) {
        mListMenuButtons.forEach({
            if (it.id != view.id && it.isFlipped)
                it.toggleFlip(true)
        })
    }
}
