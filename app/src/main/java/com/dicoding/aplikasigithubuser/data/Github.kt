package com.dicoding.aplikasigithubuser.data

import com.google.gson.annotations.SerializedName

data class Github(

    @field:SerializedName("total_count")
    val totalCount: Int,

    @field:SerializedName("incomplete_results")
    val incompleteResults: Boolean,

    @field:SerializedName("items")
    val items: List<FollowingFollower>

)