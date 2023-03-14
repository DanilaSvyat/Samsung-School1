package com.example.test02032023.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test02032023.R;
import com.example.test02032023.model.Student;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final List<Student> studentList;
    private final LayoutInflater inflater;

    public StudentAdapter(List<Student> studentList, Context context) {
        this.studentList = studentList;
        this.inflater = LayoutInflater.from(context);
    }

    private class ViewHolder extends RecyclerView.ViewHolder{

        private TextView tvId, tvName, tvAge, tvPhone, tvEmail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvId = itemView.findViewById(R.id.tv_student_id);
            tvName = itemView.findViewById(R.id.tv_student_name);
            tvAge = itemView.findViewById(R.id.tv_student_age);
            tvPhone = itemView.findViewById(R.id.tv_student_phone);
            tvEmail = itemView.findViewById(R.id.tv_student_email);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.student_item, parent, false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Student student = studentList.get(position);

        ((ViewHolder)holder).tvId.setText(String.valueOf(student.getId()));
        ((ViewHolder)holder).tvName.setText(student.getName());
        ((ViewHolder)holder).tvAge.setText(String.valueOf(student.getAge()));
        ((ViewHolder)holder).tvPhone.setText(student.getPhone());
        ((ViewHolder)holder).tvEmail.setText(student.getEmail());

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
}
