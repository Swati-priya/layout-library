package com.zopping.layout_library

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.zopping.layout_library.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.banner1?.let {
            it.setTitle("Banner with background")
            it.setTitleAllCaps(true)
            it.setTitleColor(Color.WHITE)
            it.setOnBackgroundImageClickListener { callToast() }
            it.setBannerFontFamilyRes(com.zopsmart.pagenics.components.R.font.open_sans_bold)
            it.setSubTitle("This is subtitle")
            it.setSubTitleAllCaps(false)
            it.setSubtitleColor(Color.WHITE)
            it.setSubtitleTextStyle(Typeface.NORMAL)
            it.setDescription("This is a banner description ")
            it.setDescriptionColor(Color.WHITE)
            it.setDescriptionTextStyle(Typeface.ITALIC)
            it.setBannerGravity(Gravity.START)
            it.isBannerWithButton(true)
            it.setSingleButtonText("Click me")
            it.setOnSingleButtonClickListener { callToast() }
            it.setBackgroundColorRes(R.color.teal_700)
            it.setBannerImageUrl("https://storage.googleapis.com/zopping-staging-uploads/originals%2F20230222%2Fcropped2723316702727382358-20230222-055653.jpg")
        }
    }

    private fun callToast() {
        Toast.makeText(
            context,
            "Hurray!!!",
            Toast.LENGTH_LONG
        ).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
