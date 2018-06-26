package me.portfolio.aungkhanthtoo.unsplash.viewholders

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Callback
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso
import me.portfolio.aungkhanthtoo.unsplash.R
import me.portfolio.aungkhanthtoo.unsplash.data.vos.Photo
import java.lang.Exception


class PhotoViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val photoView: ImageView = itemView.findViewById(R.id.iv_photo_item)
    private val userPic: ImageView = itemView.findViewById(R.id.iv_avatar_item)
    private val nameText: TextView = itemView.findViewById(R.id.tv_photographer_item)

    fun bindTo(photo: Photo) {
        nameText.text = photo.user.name

        Picasso.get()
                .load(photo.user.profileImage.mediumImage)
                .noFade()
                .into(userPic)

        Picasso.get()
                .load(photo.url.regularImage)
                .fit()
                .into(photoView)
    }


}