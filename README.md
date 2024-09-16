# FetchApp

## Overview
FetchApp is a native Android application built in Kotlin that retrieves and displays data from a remote JSON source. The app fetches the data from [this URL](https://fetch-hiring.s3.amazonaws.com/hiring.json) and presents it in an organized, user-friendly list.

## Features
- Retrieves data from the provided JSON endpoint.
- Displays items grouped by `listId`.
- Sorts items by `listId` and then by `name`.
- Filters out items where `name` is blank or null.
- Provides an easy-to-read interface for users.

## Requirements
- Kotlin or Java for Android development.
- The project is buildable on the latest stable Android Studio version.
- Supports the current release of the Android mobile OS.

## Getting Started
1. Clone the repository.
2. Open the project in the latest version of Android Studio.
3. Build and run the app on an emulator or physical device.

## How It Works
1. Fetches data from `https://fetch-hiring.s3.amazonaws.com/hiring.json`.
2. Filters out items where `name` is blank or null.
3. Groups the items by `listId`.
4. Sorts the items by `listId` and then by `name`.
5. Displays the sorted list in a grouped format.

## Tools & Libraries Used
- Kotlin for Android Development
- Retrofit for network operations
- ViewModel and LiveData for data handling
- RecyclerView for displaying the list

## Usage
Run the app on an emulator or physical device to see the list of items retrieved and displayed in a sorted and grouped manner.
