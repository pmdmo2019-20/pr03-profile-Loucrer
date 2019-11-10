package es.iessaladillo.pedrojoya.profile.ui.avatar

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import es.iessaladillo.pedrojoya.profile.R
import es.iessaladillo.pedrojoya.profile.data.local.Database
import es.iessaladillo.pedrojoya.profile.data.local.entity.Avatar
import kotlinx.android.synthetic.main.avatar_activity.*

class AvatarActivity : AppCompatActivity() {

    lateinit var imagen: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.avatar_activity)
        getImage()
    }

    private fun getImage() {
        chkAvatar1.setOnClickListener{UncheckedAllOneAndChooseImagen()}
        imgAvatar1.setOnClickListener{UncheckedAllOneAndChooseImagen()}
        chkAvatar2.setOnClickListener{UncheckedAllTwoAndChooseImagen()}
        imgAvatar2.setOnClickListener{UncheckedAllOneAndChooseImagen()}
        chkAvatar3.setOnClickListener{UncheckedAllThreeAndChooseImagen()}
        imgAvatar3.setOnClickListener{UncheckedAllOneAndChooseImagen()}
        chkAvatar4.setOnClickListener{UncheckedAllFourAndChooseImagen()}
        imgAvatar4.setOnClickListener{UncheckedAllOneAndChooseImagen()}
        chkAvatar5.setOnClickListener{UncheckedAllFiveAndChooseImagen()}
        imgAvatar5.setOnClickListener{UncheckedAllOneAndChooseImagen()}
        chkAvatar6.setOnClickListener{UncheckedAllSixAndChooseImagen()}
        imgAvatar6.setOnClickListener{UncheckedAllOneAndChooseImagen()}
        chkAvatar7.setOnClickListener{UncheckedAllSevenAndChooseImagen()}
        imgAvatar7.setOnClickListener{UncheckedAllOneAndChooseImagen()}
        chkAvatar8.setOnClickListener{UncheckedAllEightAndChooseImagen()}
        imgAvatar8.setOnClickListener{UncheckedAllOneAndChooseImagen()}
        chkAvatar9.setOnClickListener{UncheckedAllNineAndChooseImagen()}
        imgAvatar9.setOnClickListener{UncheckedAllOneAndChooseImagen()}
    }



    private fun UncheckedAllOneAndChooseImagen() {
        imagen = imgAvatar1
        chkAvatar2.isChecked = false
        chkAvatar3.isChecked = false
        chkAvatar4.isChecked = false
        chkAvatar5.isChecked = false
        chkAvatar6.isChecked = false
        chkAvatar7.isChecked = false
        chkAvatar8.isChecked = false
        chkAvatar9.isChecked = false
    }
    private fun UncheckedAllTwoAndChooseImagen() {
        imagen = imgAvatar2
        chkAvatar1.isChecked = false
        chkAvatar3.isChecked = false
        chkAvatar4.isChecked = false
        chkAvatar5.isChecked = false
        chkAvatar6.isChecked = false
        chkAvatar7.isChecked = false
        chkAvatar8.isChecked = false
        chkAvatar9.isChecked = false
    }
    private fun UncheckedAllThreeAndChooseImagen() {
        imagen = imgAvatar3
        chkAvatar1.isChecked = false
        chkAvatar2.isChecked = false
        chkAvatar4.isChecked = false
        chkAvatar5.isChecked = false
        chkAvatar6.isChecked = false
        chkAvatar7.isChecked = false
        chkAvatar8.isChecked = false
        chkAvatar9.isChecked = false
    }
    private fun UncheckedAllFourAndChooseImagen() {
        imagen = imgAvatar4
        chkAvatar2.isChecked = false
        chkAvatar3.isChecked = false
        chkAvatar1.isChecked = false
        chkAvatar5.isChecked = false
        chkAvatar6.isChecked = false
        chkAvatar7.isChecked = false
        chkAvatar8.isChecked = false
        chkAvatar9.isChecked = false
    }
    private fun UncheckedAllFiveAndChooseImagen() {
        imagen = imgAvatar5
        chkAvatar2.isChecked = false
        chkAvatar3.isChecked = false
        chkAvatar4.isChecked = false
        chkAvatar1.isChecked = false
        chkAvatar6.isChecked = false
        chkAvatar7.isChecked = false
        chkAvatar8.isChecked = false
        chkAvatar9.isChecked = false
    }
    private fun UncheckedAllSixAndChooseImagen() {
        imagen = imgAvatar6
        chkAvatar2.isChecked = false
        chkAvatar3.isChecked = false
        chkAvatar4.isChecked = false
        chkAvatar5.isChecked = false
        chkAvatar1.isChecked = false
        chkAvatar7.isChecked = false
        chkAvatar8.isChecked = false
        chkAvatar9.isChecked = false
    }
    private fun UncheckedAllSevenAndChooseImagen() {
        imagen = imgAvatar7
        chkAvatar2.isChecked = false
        chkAvatar3.isChecked = false
        chkAvatar4.isChecked = false
        chkAvatar5.isChecked = false
        chkAvatar6.isChecked = false
        chkAvatar1.isChecked = false
        chkAvatar8.isChecked = false
        chkAvatar9.isChecked = false
    }
    private fun UncheckedAllEightAndChooseImagen() {
        imagen = imgAvatar8
        chkAvatar2.isChecked = false
        chkAvatar3.isChecked = false
        chkAvatar4.isChecked = false
        chkAvatar5.isChecked = false
        chkAvatar6.isChecked = false
        chkAvatar7.isChecked = false
        chkAvatar1.isChecked = false
        chkAvatar9.isChecked = false
    }
    private fun UncheckedAllNineAndChooseImagen() {
        imagen = imgAvatar9
        chkAvatar2.isChecked = false
        chkAvatar3.isChecked = false
        chkAvatar4.isChecked = false
        chkAvatar5.isChecked = false
        chkAvatar6.isChecked = false
        chkAvatar7.isChecked = false
        chkAvatar8.isChecked = false
        chkAvatar1.isChecked = false
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.avatar_activity, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.mnuSelect) {
            // TODO
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    companion object {

        const val EXTRA_AVATAR = "EXTRA_AVATAR"

    }

}


