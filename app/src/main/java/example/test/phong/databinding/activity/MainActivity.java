package example.test.phong.databinding.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import example.test.phong.databinding.EventHandler;
import example.test.phong.databinding.R;
import example.test.phong.databinding.databinding.ActivityMainBinding;
import example.test.phong.databinding.model.RegistrationModel;
import example.test.phong.databinding.model.User;


/**
 * https://android.jlelse.eu/data-binding-a-library-to-remember-1a5ab7bfc21d
 */
public class MainActivity extends AppCompatActivity implements EventHandler, View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        // info - How to avoid findViewById():
//        Inside your onCreate method initialize the data binding object by using DataBindingUtil than use that object to access all your views directly.
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        info binding in fragment
//        MyLayoutBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.my_layout, viewGroup, false);
        // info - how to set var via java fiile
//        RegistrationModel registrationModel = new RegistrationModel("Phong", "quoc lo 1a", 20, true);
        RegistrationModel registrationModel = new RegistrationModel();
        activityMainBinding.setRegistration(registrationModel);

        registrationModel.address.set("quoc lo 1a");

        // can set text by findviewbyid or set var
        activityMainBinding.included.tvName.setText("Phong");

        User user = new User("First", "Last");
        activityMainBinding.setUser(user);
    }

    @Override
    public void onHandleClick(View view) {
        Toast.makeText(this, "Click the button", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Click the button", Toast.LENGTH_SHORT).show();
    }
}
