package com.example.android_tuan7_sqlite;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Contact> contactList;

    public ContactAdapter(Context context, int layout, List<Contact> contactList) {
        this.context = context;
        this.layout = layout;
        this.contactList = contactList;
    }

    @Override
    public int getCount() {
        return contactList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(layout,null);
        TextView txtId= view.findViewById(R.id.txtId);
        TextView txtName= view.findViewById(R.id.txtName);
        TextView txtPhone= view.findViewById(R.id.txtPhone);
        Contact contact= contactList.get(i);
        txtId.setText(String.valueOf(contact.getID()));
        txtName.setText(contact.getName());
        txtPhone.setText(contact.getPhoneNumber());
        return view;
    }
}
