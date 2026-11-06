
package com.example.portfolio;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BlogActivity extends AppCompatActivity {

    RecyclerView rvBlog;
    BlogAdapter blogAdapter;
    ArrayList<String> titles;
    ArrayList<String> descriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_blog);

        rvBlog = findViewById(R.id.rvBlog);

        titles = new ArrayList<>();
        descriptions = new ArrayList<>();

        titles.add("Introduction to Programming");
        descriptions.add("Learn the basic concepts of programming.");

        titles.add("Android Development");
        descriptions.add("Discover how to build Android applications.");

        titles.add("Learning Java");
        descriptions.add("Understand Java programming fundamentals.");

        blogAdapter = new BlogAdapter(titles, descriptions);

        rvBlog.setLayoutManager(new LinearLayoutManager(this));
        rvBlog.setAdapter(blogAdapter);
    }
}
