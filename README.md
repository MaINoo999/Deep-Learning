# DigitClassifier - Android MNIST Handwritten Digit Classifier

## 📌 프로젝트 소개
DigitClassifier는 Android 앱에서 **손글씨 숫자(MNIST)를 인식**하는 간단한 머신러닝 앱입니다.  
TensorFlow Lite를 이용해 **모바일 환경에서도 숫자 인식**이 가능하도록 설계되었습니다.

- Android Studio Arctic Fox 이상 권장
- Kotlin + AndroidX 사용
- TensorFlow Lite 기반 숫자 분류

---

## 🛠 기능
- 사용자가 화면에 손글씨 숫자 입력
- 입력된 숫자를 TFLite 모델로 분류
- 예측 결과를 화면에 표시

---

## 📂 프로젝트 구조

DigitClassifier/
├─ app/                        # 앱 모듈
│  ├─ src/
│  │  ├─ main/
│  │  │  ├─ java/
│  │  │  │  └─ com/iot/android_minst/  # Kotlin 소스코드
│  │  │  ├─ res/                        # 레이아웃, 이미지 등
│  │  │  └─ AndroidManifest.xml
│  └─ build.gradle.kts                 # 앱 모듈 Gradle
├─ build.gradle.kts                     # 프로젝트 Gradle
├─ settings.gradle.kts
├─ gradle.properties
├─ README.md
└─ .gitignore                          # 필요시 추가


## ⚙️ 환경 설정

### 1. Android Studio 설치
- [Android Studio](https://developer.android.com/studio) 설치
- SDK 36 이상

### 2. Gradle 설정
프로젝트는 **Kotlin DSL**(`build.gradle.kts`) 사용  
이미 설정된 repository:
```kotlin
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven { url = uri("https://jitpack.io") }
    }
}
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
--------------------------------------------------------
3. 의존성
dependencies {
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.1")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.1")

    implementation("com.github.divyanshub024:AndroidDraw:v0.1") // 손글씨 입력

    implementation("org.tensorflow:tensorflow-lite:2.14.0")     // TFLite
}
