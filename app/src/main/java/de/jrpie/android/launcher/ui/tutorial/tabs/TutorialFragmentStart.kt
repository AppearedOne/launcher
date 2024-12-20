package de.jrpie.android.launcher.ui.tutorial.tabs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import de.jrpie.android.launcher.databinding.TutorialStartBinding
import de.jrpie.android.launcher.ui.UIObject
import de.jrpie.android.launcher.ui.blink

/**
 * The [TutorialFragmentStart] is a used as a tab in the TutorialActivity.
 *
 * It displays info about the app and gets the user into the tutorial
 */
class TutorialFragmentStart : Fragment(), UIObject {

    private lateinit var binding: TutorialStartBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = TutorialStartBinding.inflate(inflater, container, false)
        binding.tutorialStartIconRight.blink()
        return binding.root
    }

    override fun onStart() {
        super<Fragment>.onStart()
        super<UIObject>.onStart()
    }
}