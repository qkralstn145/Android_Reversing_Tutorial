실행흐름 분석 연습용 앱


사용자는 역공학을 통해 제공된 apk 파일의 코드를 보고 앱이 어떤 순서로 실행이 될지 예측.
실행 흐름을 분석해보면서 안드로이드 앱과 자바 코드에 대한 이해를 높일 수 있다.
위 앱은 안드로이드 앱(4대 컴포넌트, apk 파일 구조)에 대한 기본적인 이해를 전재로 한다.
사용 도구: 역공학에 유용한 도구 jadx 등을 활용

apk 파일 구조
androidmanifest.xml: 앱 실행 권한, 구성 요소 등에 대한 정보가 담긴 파일.
meta-inf: 서명 관련 정보가 담겨 있음.
res: 앱에 사용될 리소스 자료가 있는 디렉토리.
.dex: 안드로이드 가상머신에서 동작할 수 있도록 바이너리 코드로 변환한 파일.
resources.arsc: 컴파일된 리소스 파일.


4대 컴포넌트의 생명주기
액티비티
https://developer.android.com/guide/components/activities/intro-activities?hl=ko#mtal

서비스
https://developer.android.com/guide/components/services?hl=ko#Lifecycle

브로드캐스트 리시버
https://developer.android.com/guide/components/broadcasts?hl=ko

콘텐츠 프로바이더
생명주기 없음.
https://developer.android.com/guide/topics/providers/content-provider-basics?hl=ko
