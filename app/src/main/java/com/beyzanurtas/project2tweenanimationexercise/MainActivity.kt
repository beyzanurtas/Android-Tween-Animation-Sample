package com.beyzanurtas.project2tweenanimationexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import com.beyzanurtas.project2tweenanimationexercise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        init()
    }
    private fun init(){
        binding.flyButton.setOnClickListener(this)
        binding.alphaButton.setOnClickListener(this)
        binding.rotateButton.setOnClickListener(this)
        binding.scaleButton.setOnClickListener(this)
        binding.translateButton.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val flyanim= AnimationUtils.loadAnimation(this,R.anim.my_anim)
        val alphaanim=AnimationUtils.loadAnimation(this,R.anim.alpha_anim)
        val rotateanim=AnimationUtils.loadAnimation(this,R.anim.rotate_anim)
        val scaleanim=AnimationUtils.loadAnimation(this,R.anim.scale_anim)
        val translateanim=AnimationUtils.loadAnimation(this,R.anim.translate_anim)
      when (view?.id){
          binding.flyButton.id ->{
              binding.bee.startAnimation(flyanim)
          }
          binding.alphaButton.id ->{
              binding.bee.startAnimation(alphaanim)
          }
          binding.rotateButton.id ->{
              binding.bee.startAnimation(rotateanim)
          }
          binding.scaleButton.id ->{
              binding.bee.startAnimation(scaleanim)
          }
          binding.translateButton.id ->{
              binding.bee.startAnimation(translateanim)
      }
      }
    }
}