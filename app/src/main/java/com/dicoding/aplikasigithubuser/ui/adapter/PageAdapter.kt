package com.dicoding.aplikasigithubuser.ui.adapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.dicoding.aplikasigithubuser.ui.FollowingFollowerFragment

class PageAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    var username: String = ""

    override fun createFragment(position: Int): Fragment {
        val fragment = FollowingFollowerFragment()
        fragment.arguments = Bundle().apply {
            putInt(FollowingFollowerFragment.ARG_POSITION, position + 1)
            putString(FollowingFollowerFragment.ARG_USERNAME, username)
        }
        return fragment
    }
    override fun getItemCount(): Int {
        return 2
    }
}