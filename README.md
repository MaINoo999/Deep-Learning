# DigitClassifier - Android MNIST Handwritten Digit Classifier

## 📌 프로젝트 소개
DigitClassifier는 Android 앱에서 **손글씨 숫자(MNIST)를 인식**하는 간단한 머신러닝 앱입니다.  
TensorFlow Lite를 이용해 **모바일 환경에서도 숫자 인식**이 가능하도록 설계되었습니다.

- Android Studio Arctic Fox 이상 권장
- Kotlin + AndroidX 사용
- TensorFlow Lite 기반 숫자 분류
![시작화면](https://github.com/MaINoo999/Deep-Learning/blob/1e4bdbd3702c1310203c0d1a7251549c687c432f/image/start%20(2).png)
![설명 텍스트](이미지_경로)
![설명 텍스트](이미지_경로)
![설명 텍스트](이미지_경로)

---

## 🛠 기능
- 사용자가 화면에 손글씨 숫자 입력
- 입력된 숫자를 TFLite 모델로 분류
- 예측 결과를 화면에 표시

---

## 📂 프로젝트 구조

DigitClassifier/
├─ app/                         # 앱 모듈

│  ├─ src/

│  │  ├─ main/

│  │  │  ├─ java/

│  │  │  │  └─ com/iot/android_minst/  # Kotlin 소스코드

│  │  │  ├─ res/                        # 레이아웃, 이미지 등

│  │  │  └─ AndroidManifest.xml

│  └─ build.gradle.kts                   # 앱 모듈 Gradle

├─ build.gradle.kts                       # 프로젝트 Gradle

├─ settings.gradle.kts

├─ gradle.properties

├─ README.md

└─ .gitignore                            # 필요시 추가


---

## ⚙️ 프로젝트 설정 방법

### 1. Android Studio 설치
- [Android Studio 공식 사이트](https://developer.android.com/studio)에서 Android Studio를 다운로드하고 설치합니다.
- 설치 시 Kotlin과 Android SDK도 함께 설치합니다.

### 2. 프로젝트 복사
- GitHub를 사용하지 않는 경우, 프로젝트 폴더를 zip으로 공유하거나 직접 복사합니다.
- 예를 들어, `DigitClassifier` 폴더를 원하는 위치에 저장합니다.

### 3. Android Studio에서 열기
1. Android Studio를 실행합니다.
2. `Open an existing project`를 선택합니다.
3. `DigitClassifier` 폴더를 선택하고 열기를 클릭합니다.
4. Gradle이 자동으로 프로젝트를 동기화합니다. (`Sync Now` 버튼 클릭 시)

### 4. Gradle 의존성 확인
- `build.gradle.kts` 파일에서 다음과 같은 주요 의존성을 확인할 수 있습니다.

```kotlin
// TensorFlow Lite
implementation("org.tensorflow:tensorflow-lite:2.14.0")

// AndroidDraw 라이브러리
implementation("com.github.divyanshub024:AndroidDraw:v0.1")

// AndroidX 기본 라이브러리
implementation(libs.androidx.core.ktx)
implementation(libs.androidx.appcompat)
implementation(libs.material)
implementation(libs.androidx.constraintlayout)
implementation(libs.androidx.navigation.fragment.ktx)
implementation(libs.androidx.navigation.ui.ktx)
