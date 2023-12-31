# ArtBook App 2023

### In this project, within the developed art book application, the searched words in the search section of the relevant screen are listed to users in a GridView through the 'pixabay.com' API. The selected image can be retrieved from the API, and by entering the image name, artist's name, and year information, it can be saved to the local repository. The saved images and their details are listed in a RecyclerView on the main screen. 

#### The MVVM architecture was used in development. Although the application is simple, it incorporates many Kotlin structures and advanced operations. UI elements are connected with 'View Binding'. Data is listed in a RecyclerView. Data is fetched from the Remote API with Retrofit. LiveData, Room database, and GSON structure are utilized. Coroutines are used for asynchronous operations. The Navigation library is used for page transitions. Glide library is used for image processing. Fragments are used in activities, and Dependency Injection with Hilt is applied in many places.

## Used libraries:

    implementation "com.google.dagger:hilt-android:2.48"

    ksp "com.google.dagger:hilt-compiler:2.48"

    ksp "androidx.hilt:hilt-compiler:1.1.0"

    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4'

    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1'

    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2"

    implementation "androidx.lifecycle:lifecycle-extensions:2.2.0"

    implementation "androidx.lifecycle:lifecycle-livedata-ktx:2.6.2"

    implementation "androidx.lifecycle:lifecycle-runtime:2.6.2"

    implementation "androidx.lifecycle:lifecycle-runtime-ktx:2.6.2"

    implementation "androidx.activity:activity-ktx:1.8.1"

    implementation "androidx.room:room-runtime:2.6.0"

    ksp "androidx.room:room-compiler:2.6.0"

    implementation "androidx.room:room-ktx:2.6.0"

    ksp("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.5.0")

    implementation 'com.squareup.retrofit2:retrofit:2.9.0'

    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'

    implementation "androidx.navigation:navigation-fragment-ktx:2.7.5"

    implementation "androidx.navigation:navigation-ui-ktx:2.7.5"

    implementation 'com.github.bumptech.glide:glide:4.15.0'

    ksp 'com.github.bumptech.glide:ksp:4.14.2'

    implementation (platform("org.jetbrains.kotlin:kotlin-bom:1.8.0"))


    // TestImplementations

    implementation "androidx.test:core:1.5.0"

    testImplementation "junit:junit:4.13.2"

    testImplementation "org.hamcrest:hamcrest-all:1.3"

    testImplementation "androidx.arch.core:core-testing:2.2.0"

    testImplementation "org.robolectric:robolectric:4.8.1"

    testImplementation "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.1"

    testImplementation "com.google.truth:truth:1.1.4"

    testImplementation "org.mockito:mockito-core:4.7.0"

    // Android Test Implementations

    androidTestImplementation "junit:junit:4.13.2"

    androidTestImplementation "org.mockito:mockito-android:4.7.0"

    androidTestImplementation "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.1"

    androidTestImplementation "androidx.arch.core:core-testing:2.2.0"

    androidTestImplementation "com.google.truth:truth:1.1.4"

    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'

    androidTestImplementation "org.mockito:mockito-core:4.7.0"

    androidTestImplementation 'com.google.dagger:hilt-android-testing:2.43.2'

    kspAndroidTest 'com.google.dagger:hilt-android-compiler:2.48'

    debugImplementation "androidx.fragment:fragment-testing:1.7.0-alpha06"

    androidTestImplementation("androidx.test.espresso:espresso-contrib:3.5.1") {
        exclude group : "org.checkerframework", module : "checker"
    }

