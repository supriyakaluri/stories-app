package com.example.storiesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

import xute.storyview.StoryModel;
import xute.storyview.StoryView;

public class MainActivity extends AppCompatActivity {

    StoryView storyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storyView = (StoryView) findViewById(R.id.storyview);
        storyView.resetStoryVisits(); //used to reset story if user have already visited or watched the story.

        //Creating a list of Stories

        ArrayList<StoryModel> storyLists = new ArrayList<>();

        storyLists.add(new StoryModel("https://i.pinimg.com/originals/d6/2b/23/d62b2397032c71d63ed5f4c7d40589e5.jpg","Name or caption 1", "10:31 PM")); //this is story 1
        storyLists.add(new StoryModel("https://danceask.com/wp-content/uploads/2017/12/KATHAKALI-900x593.jpg","Name or caption 2", "10:31 PM")); //this is story 2
        storyLists.add(new StoryModel("https://blogbox.indianeagle.com/wp-content/uploads/2014/04/kathak-dance-indian-classical-dance-forms.jpg","Name or caption 3", "10:31 PM")); //this is story 3

        storyView.setImageUris(storyLists);


    }
}