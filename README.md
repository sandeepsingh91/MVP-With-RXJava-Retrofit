# Android Sample Project: MVP with RxJava and Retrofit

## Overview

This repository contains a simple Android application demonstrating the MVP (Model-View-Presenter) architecture pattern integrated with RxJava for asynchronous programming and Retrofit for network requests.

The application fetches data from a remote API using Retrofit and displays it. RxJava is used to handle asynchronous operations and manage data streams, showcasing how to structure an Android project for scalability and testability.

## Features

- Fetches data from a remote API endpoint using Retrofit.
- Handles asynchronous operations and data streams with RxJava.
- Implements the MVP architecture pattern for clear separation of concerns.

## Libraries Used

- **Retrofit**: For API communication.
- **RxJava**: For asynchronous and reactive programming.
- **Moshi**: For JSON parsing. 

## Installation

1. Clone the repository: https://github.com/sandeepsingh91/MVP-With-RXJava-Retrofit.git
2. Open the project in Android Studio.

3. Build and run the project on an Android device or emulator.

## Usage

- Upon launching the app, data will be fetched asynchronously from the remote API using Retrofit and RxJava.
- Data will be displayed in a list using RecyclerView with custom adapters.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License. See the [LICENSE](./LICENSE) file for details.

