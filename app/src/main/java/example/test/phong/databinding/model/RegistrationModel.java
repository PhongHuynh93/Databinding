package example.test.phong.databinding.model;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by user on 7/30/2017.
 * It sets the field with observable which continuously monitors for any changes in the contents.
 *
 * No getters and setters?
 *
 * You may use like name.set(“Jack”) and name.get() to retrieve value.
 */
public class RegistrationModel {
    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<String> address = new ObservableField<>();
    public ObservableInt age = new ObservableInt();
    public ObservableBoolean isMinor = new ObservableBoolean();

    // info - Using Constructor:
    public RegistrationModel(String name, String address, int age, boolean isMinor) {
        this.name.set(name);
        this.address.set(address);
        this.age.set(age);
        this.isMinor.set(isMinor);
    }

    public RegistrationModel() {
    }
}
