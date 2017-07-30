package example.test.phong.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import example.test.phong.databinding.databinding.ActivityMainBinding;


/**
 * https://android.jlelse.eu/data-binding-a-library-to-remember-1a5ab7bfc21d
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        // info - How to avoid findViewById():
//        Inside your onCreate method initialize the data binding object by using DataBindingUtil than use that object to access all your views directly.
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // info - how to set var via java fiile
//        RegistrationModel registrationModel = new RegistrationModel("Phong", "quoc lo 1a", 20, true);
        RegistrationModel registrationModel = new RegistrationModel();
        activityMainBinding.setRegistration(registrationModel);

        registrationModel.address.set("quoc lo 1a");
    }
}
