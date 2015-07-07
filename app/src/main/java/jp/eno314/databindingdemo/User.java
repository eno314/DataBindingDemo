package jp.eno314.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by eno314 on 2015/07/07.
 */
public class User extends BaseObservable {

    private String mFirstName;

    private String mLastName;

    public User(String firstName, String lastName) {
        mFirstName = firstName;
        mLastName = lastName;
    }

    @Bindable
    public String getFirstName() {
        return mFirstName;
    }

    @Bindable
    public String getLastName() {
        return mLastName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
        notifyPropertyChanged(jp.eno314.databindingdemo.BR.firstName);
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
        notifyPropertyChanged(jp.eno314.databindingdemo.BR.lastName);
    }
}
