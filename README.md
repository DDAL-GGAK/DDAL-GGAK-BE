# 딸깍 DDAL-GGAK

# **👉🏻** 프로젝트 소개

> "딸깍, 간편한 업무 관리로 시간과 노력을 절약하세요."
> 
> 
> 
> 업무 수행을 체계적으로 관리하고 성과를 측정할 수 있습니다.
> 
> 🖱️[딸깍 서비스 이용하기](https://ddal-ggak-fe.vercel.app/)
> 
> 🖱️[딸깍 노션](https://www.notion.so/e11016a0ca7a41a4932301027925670e)
> 

### 🗓️ 프로젝트 운영 기간

> 🛖개발 기간: 2023년 3월 10일 ~ 2023년 4월 20일
> 
> 
> 🏠운영 기간: 2023년 4월 16일 ~ 2023년 4월 29일
> 

---

# 🛠️ 프로젝트 아키텍처

![스크린샷 2023-04-15 오후 8.46.33.png](%E1%84%84%E1%85%A1%E1%86%AF%E1%84%81%E1%85%A1%E1%86%A8%20DDAL-GGAK%205d44eae726a0475bbe78e467482db4fd/%25EC%258A%25A4%25ED%2581%25AC%25EB%25A6%25B0%25EC%2583%25B7_2023-04-15_%25EC%2598%25A4%25ED%259B%2584_8.46.33.png)

---

# **⚙** 기술 스택

> ⭐Front-End
> 
> 
> 
> ⭐Back-End
> 
> ⭐Dev Tools
> 
> ****
> 

---

# **📝 기술 스택 & 라이브러리 사용 이유**

| 기술 스택 | 사용이유 |
| --- | --- |
| Redux ToolKit | 가장 유명한 전역 상태 관리 라이브러리 인 Redux에서 추가적으로 immer와 thunk가 내장 되어 업그레이드 된 라이브러리, 게시물 업로드 및 예약 상태 관리에 있어서 각 컴포넌트 별 State 값이 공통적으로 적용되어야 하기에 사용 하였음 |
| STOMPJS/SOCKJS | 프로젝트 협업 BackEnd서버가 node.js가 아닌 spring.java로 가장 호환성이 좋은 라이브러리로 Billy프로젝트의 가장 핵심 기능인 채팅을 구현하기 위하여 사용 |
| PWA | 모바일 최적화를 위하여 실제 IOS 혹은 google 앱 배포가 아니지만 최대한 비슷한 느낌을 주어 웹과 앱의 이질감을 최소화 |
| 카카오 지도 API | - 대여하는 장소를 단순한 주소 검색으로 하여 Text로 표시 해주는게 아닌 Map을 활용한 친절한 UI/UX를 제공 하기 위하여 카카오 지도 API를 사용- 비슷한 기능을 하는 API인 구글/네이버 지도가 존재하였지만 카카오 간편 로그인을 통하여 이미 발급 받은 엑세스key로 카카오 지도 API도 사용 가능하였기에 코드의 부담을 한줄이라도 덜 수 있어서 카카오 지도 API를 선택 |
| SWIPER | React 개발자들이 가장 많이 사용하는 이미지 슬라이더 라이브러리로 사용 방법 및 최적화 관련한 자료가 많아서 사용 |
| Browser-Image-Compression | FrontEnd에서 이미지 업로드 크기를 최적화 하여 BackEnd 서버로 전달 해야 하기 때문에 사용된 라이브러리로 자바스크립트 기반 이미지 압축이라 API 사용법이 매우 간편하여 선택 |
| React-Multi-Date-Picker | 예약 서비스를 제공 해야 하는 프로젝트 특성상 사용하게 된 달력 라이브러리로 단일 일자 선택 혹은 기간 선택도 가능하여 사용하게 되었지만 CSS적인 부분을 커스텀하기 어려운 단점이 있었음 |
| React-Router-Dom | SPA방식의 React에 주소창을 변경하였을 때 다른 컴포넌트가 보여지도록 하기 위하여 사용한 라이브러리 |
| Redis |  |
| VERCEL | FrontEnd 호스팅 사이트로서 복잡한 절차없이 GitHub 레포지토리를 이용하여 빠른 배포가 가능 하다는 장점이 있고, PWA로 구현된 프로젝트로서 모바일 환경에 맞게 설계되어 수시로 스마트폰에서 적용된 내역을 디버깅 할수 있어야하는데, vercel을 통해 GitHub에 연결하면 완성된 main branch 뿐 아니라 개발중인 dev/개인개발branch 에 push 사항도 휘발성있는 https:// 주소를 알려주어 선택하게된 호스팅 사이트 |

---

# 💥 트러블 슈팅

- 
- 
- 
- 
- 

---

# 👥팀원

FE

김대현 : [https://github.com/pengooseDev](https://github.com/pengooseDev)

박지현 : [https://github.com/Taffymark1](https://github.com/Taffymark1)

BE

조영준 : [https://github.com/choincnp](https://github.com/choincnp)

박현아 : [https://github.com/aihtnyc-h](https://github.com/aihtnyc-h)

박성민 : [https://github.com/seongminnnn](https://github.com/seongminnnn)
