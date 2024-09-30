# Recipe App

## Overview
The Recipe App is a mobile application developed using Kotlin and XML, designed to provide users with a collection of recipes. The app utilizes the Room Database for efficient local storage of user favorites and features intuitive UI layouts for recipe details, ensuring an optimized and smooth user experience.

## Features
- **Local Storage:** Utilizes Room Database for efficient storage of user favorites.
- **Intuitive UI:** Designed user-friendly layouts for easy navigation and interaction.
- **Recipe Details:** View detailed information about recipes .
- **Favorites:** Users can save their favorite recipes for quick access later.

## Technologies Used
- **Programming Language:** Kotlin
- **UI Design:** XML
- **Database:** Room Database
- **Architecture:** MVVM (Model-View-ViewModel) 
- **Dependencies:**
-  implementation("pl.droidsonroids.gif:android-gif-drawable:1.2.29")
    var room_version = "2.6.1"
    implementation("androidx.room:room-runtime:$room_version")
    annotationProcessor("androidx.room:room-compiler:$room_version")
    implementation ("com.github.bumptech.glide:glide:4.14.2")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.14.2")

    // To use Kotlin annotation processing tool (kapt)
    kapt("androidx.room:room-compiler:$room_version")

    implementation ("com.github.bumptech.glide:glide:4.16.0")

## Installation
To run the Recipe App on your local machine, follow these steps:

1. **Clone the Repository**
   ```bash
   https://github.com/BARDAVAL-JAGADEESH/Recipe-App.git
   cd Recipe-App
