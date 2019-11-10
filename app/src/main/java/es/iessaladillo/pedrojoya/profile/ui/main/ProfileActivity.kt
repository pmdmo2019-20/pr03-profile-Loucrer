package es.iessaladillo.pedrojoya.profile.ui.main

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import es.iessaladillo.pedrojoya.profile.R
import es.iessaladillo.pedrojoya.profile.ui.avatar.AvatarActivity
import es.iessaladillo.pedrojoya.profile.utils.*
import kotlinx.android.synthetic.main.profile_activity.*

//import kotlinx.android.synthetic.main.profile_avatar.*
//import kotlinx.android.synthetic.main.profile_form.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_activity)
        goIntents()
    }


    private fun checkFields(): Boolean {
        var check = true
        if (txtName.text.toString().isBlank()) {
            txtName.error = getString(R.string.profile_invalid_name)
            check = false
        }
        if (txtAddress.text.toString().isBlank()) {
            txtAddress.error = getString(R.string.profile_invalid_address)
            check = false
        }
        if (txtEmail.text.toString().isBlank() || !txtEmail.text.toString().isValidEmail()) {
            txtEmail.error = getString(R.string.profile_invalid_email)
            check = false
        }
        if (txtPhonenumber.text.toString().isBlank() || !txtPhonenumber.text.toString().isValidPhone()) {
            txtPhonenumber.error = getString(R.string.profile_invalid_phonenumber)
            check = false
        }
        if (txtWeb.text.toString().isBlank() || !txtWeb.text.toString().isValidUrl()) {
            txtWeb.error = getString(R.string.profile_invalid_web)
            check = false
        }
        return check
    }


    private fun goIntents() {
        val intent = Intent(this,AvatarActivity::class.java)

        imgEmail.setOnClickListener{checkImgEmail()}
        imgPhonenumber.setOnClickListener {checkImgPhoneNumber()}
        imgWeb.setOnClickListener {checkImgWeb()}
        imgAddress.setOnClickListener {checkImgAddress()}

        imgAvatar.setOnClickListener{startActivity(intent)}
        lblName.setOnClickListener{startActivity(intent)}
    }

    private fun checkImgWeb() {
        if (txtWeb.text.toString().isBlank()) {
            toast("Invalid web")
        } else {
            imgWeb.setOnClickListener { startActivity(newViewUriIntent(Uri.parse(txtWeb.text.toString()))) }
        }
    }

    private fun checkImgAddress() {
        if (txtAddress.text.toString().isBlank()) {
            toast("Invalid Address")
        } else {
            imgAddress.setOnClickListener { startActivity(newSearchInMapIntent(txtAddress.text.toString())) }
        }
    }

    private fun checkImgPhoneNumber() {
        if (txtPhoneNumber.text.toString().isBlank() ) {
            toast("Invalid Phone Number")
        } else {
            imgPhonenumber.setOnClickListener { startActivity(newDialIntent(txtPhoneNumber.text.toString())) }
        }
    }

    private fun checkImgEmail() {
        if (txtEmail.text.toString().isBlank()) {
            toast("Invalid Email")
        } else {
            imgEmail.setOnClickListener { startActivity(newEmailIntent(txtEmail.text.toString())) }
        }
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.profile_activity, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.mnuSave) {
            save()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        //Falta por hacer
    }

    private fun save() {
        if(checkFields()){
            toast(getString(R.string.validateCorrect))
        }

    }

}
