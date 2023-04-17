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

> 💻개발 기간: 2023년 3월 10일 ~ 2023년 4월 20일
> 
> 
> 👩‍💼운영 기간: 2023년 4월 17일 ~ 2023년 4월 29일
> 


# 🛠️ ERD
![Alt Text](https://drive.google.com/uc?id=1k1kbjM2F9kBCj7HMYDr-_47qbZ94Soc3)

---

# 🛠️ 프로젝트 아키텍처
![Alt Text](https://drive.google.com/uc?export=download&id=103oPx8kR-ckDIvgZw1ss_ihDbNd_5lBh)


---

# 📚 기술 스택

> ⭐Front-End<br>
> <img src="https://img.shields.io/badge/react-61DAFB?style=for-the-badge&logo=react&logoColor=white"> <img src="https://img.shields.io/badge/react query-FF4154?style=for-the-badge&logo=react&logoColor=white"> <img src="https://img.shields.io/badge/styled_components-DB7093?style=for-the-badge&logo=styledcomponents&logoColor=white"> <img src="https://img.shields.io/badge/vercel-000000?style=for-the-badge&logo=vercel&logoColor=white"><img src="https://img.shields.io/badge/reactrouter-CA4245?style=for-the-badge&logo=reactrouter&logoColor=white">  <img src="https://img.shields.io/badge/typescript-3178C6?style=for-the-badge&logo=typescript&logoColor=white"> <img src="https://img.shields.io/badge/react_hook_form-EC5990?style=for-the-badge&logo=reacthookform&logoColor=white"> <img src="https://img.shields.io/badge/axios-5A29E4?style=for-the-badge&logo=axios&logoColor=white"> <br><br>
 ⭐Back-End<br>
   <img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"> <img src="https://img.shields.io/badge/spring boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"> <img src="https://img.shields.io/badge/spring security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white"> <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> <img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white"> <img src="https://img.shields.io/badge/nginx-009639?style=for-the-badge&logo=nginx&logoColor=white"> <img src="https://img.shields.io/badge/aws-FF9900?style=for-the-badge&logo=amazonaws&logoColor=white"> <img src="https://img.shields.io/badge/amazon rds-527FFF?style=for-the-badge&logo=amazonrds&logoColor=white"> <img src="https://img.shields.io/badge/amazon ec2-FF9900?style=for-the-badge&logo=amazonec2&logoColor=white"> <img src="https://img.shields.io/badge/amazon s3-569A31?style=for-the-badge&logo=amazons32&logoColor=white"> <img src="https://img.shields.io/badge/query_dsl-009CE9?style=for-the-badge&logo=querydsl&logoColor=white"> <img src="https://img.shields.io/badge/spring data-6DB33F?style=for-the-badge&logo=springdata&logoColor=white"> <img src="https://img.shields.io/badge/spring framework-6DB33F?style=for-the-badge&logo=springframework&logoColor=white"> <img src="https://img.shields.io/badge/spring webflux-6DB33F?style=for-the-badge&logo=springwebflux&logoColor=white"> <img src="https://img.shields.io/badge/JWT-000000?style=for-the-badge&logo=JsonWebTokens&logoColor=white"> <img src="https://img.shields.io/badge/github actions-2088FF?style=for-the-badge&logo=githubactions&logoColor=white"><br><br>
⭐Dev Tools<br><img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"> <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white"> <img src="https://img.shields.io/badge/Visual Studio code-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white"> <img src="https://img.shields.io/badge/IntelliJ-000000?style=for-the-badge&logo=intellij&logoColor=white">
---

# **📝 기술 채택 이유**
<ul id="37993fec-340c-4550-b452-4eae3a1a5d40" class="toggle"><details close=""><summary>React</summary><blockquote id="b8f6517e-a14a-4dde-94d1-433dc7d48a97" class=""><strong>도입 사유</strong><br>1. State 변경에 따른 반응성 유지.
2. 함수 컴포넌트를 사용한 컴포넌트 재사용성 증대.</blockquote></details></li></ul><p id="6e05c84f-2ad8-4f9d-b4a4-b721d21d68ca" class="">
</p><ul id="b4dfc9c5-23be-4f9c-b118-d8e47296c3ba" class="toggle"><details close=""><summary>Redux</summary><blockquote id="bb9fc17e-b159-4e5d-887b-e8bb2bd622c8" class=""><strong>도입 사유 </strong><br>
클라이언트의 state 관리 및 Provider pattern을 이용한 컴포넌트 간 불필요한 의존성을 제거하고 재사용성 확보.<ul  class="toggle"><details open=""><summary>redux, recoil, zustand 등</summary><ul id="fb034d5a-34a0-41ca-8894-130872d0ad3e" class="bulleted-list"><li style="list-style-type:disc">현재 프로젝트 상태만 보면 recoil을 사용하는 것이 맞으나, 최종적으로 만들고자 하는 프로덕트는 B2B SaaS이기 때문에 결국 프로덕트의 규모는 굉장히 커질 예정입니다.
 따라서, 초반에 작성해야 할 코드가 좀 있겠지만, 나중의 스케일업에 대한 유동성을 고려해본다면 redux로 상태를 관리하는 것이 옳다고 판단했습니다.</li></ul></details></li></ul></blockquote></details></li></ul><p id="ed9f652d-1ab4-493e-a228-664a0ca1d4fb" class="">
</p><ul id="783a5f3f-1769-4393-813f-1265f1f4222e" class="toggle"><details close=""><summary>react-query</summary><blockquote id="97e66895-479d-4977-9663-0a895f00fbbd" class=""><strong>도입 사유 </strong><br>
1. 데이터 캐싱을 이용한 쾌적한 렌더링.<br>
2. BE와의 데이터 동기화.<br>
3. HTTP 프로토콜 통신 결과 핸들링.<ul id="1bf2374c-426a-4fce-9fa8-2712d53a7786" class="toggle"><details open=""><summary>swr, react-query</summary><ul id="bbb0f8de-d200-4496-b4ad-d23865781731" class="bulleted-list"><li style="list-style-type:disc">redux-thunk는 FE의 middleware이지 HTTP 프로토콜 통신을 담당하기 위해 나온 라이브러리는 아니기 때문에 고려대상에서 배제하였습니다.</li></ul><ul id="08ad7af5-689c-4ea4-afcd-af24bf4c970e" class="bulleted-list"><li style="list-style-type:disc"> 현재는 react-query나 swr, 나아가 NextJS 13 버젼 등. 데이터 캐싱과 BE데이터 동기화에 관한 뛰어난 성능을 제공하는 라이브러리 및 프레임워크가 많이 출시되었으며, 커스텀 캐싱 및 BE와의 데이터 동기화에 성능이 뛰어난 react-query를 채택하였습니다. </li></ul></details></li></ul></blockquote></details></li></ul><p id="2fe3af36-5c44-4780-8a5d-f42d8143bcde" class="">
</p><ul id="2c71ec37-8880-4f64-9d34-36974d6f9d31" class="toggle"><details close=""><summary>Typescript</summary><blockquote id="67e932e1-ea39-4c59-bd9c-1156ec7ea347" class=""><strong>도입 사유 </strong><br> 
1. type을 통한 안정성 확보.<br>
2. 미처 잡아내지 못한 에러 디버깅.<br>
3. 자동완성 기능.</blockquote></details></li></ul><p id="5bd3588f-4575-4fdf-8870-eb42ddc9b01c" class="">
</p><ul id="41f44fa8-61cd-47cd-97f7-e3576f75f499" class="toggle"><details close=""><summary>styled-components</summary><blockquote id="e4962097-b2c4-408c-aa01-9f7150187f6d" class=""><strong>도입 사유</strong><br>
1. 외부 환경변화에 따른 유동적 대처가 가능.<br>
2. 함수 컴포넌트에 여러 props를 전달하더라도 복잡한 optional rendering을 제어할 수 있음.<br>
3. 전역적으로 스타일링에 대한 책임을 담당하고 책임을 부여.<ul id="fd03e204-9ef2-4999-8d9c-ec52e0c692ba" class="toggle"><details open=""><summary>TailwindCSS</summary><p id="863635e3-1005-49dd-9926-dadcf95634db" class="">기본적으로 적용된 CSS 프리셋이 있어 간편하다는 장점이 있지만, props를 통해 optional하게 CSS를 적용할 경우, 가독성이 크게 떨어진다는 문제점이 있습니다. 또한, 이것과 더불어 전역적인 style 적용에도 어려움이 있습니다.
 결국, 외부환경의 변화에 유동적으로 대처하며, 복잡하고 상세한 CSS를 적용하고자 styled-components를 채택하였습니다.</p></details></li></ul></blockquote></details></li></ul><p id="36715e77-ac57-4f90-b1db-1297deabfaa7" class="">
</p><ul id="b313f486-d36f-4511-adcf-4613c9b4fdc7" class="toggle"><details close=""><summary>react-hook-form</summary><blockquote id="7613abb4-c816-4cd9-ae97-223fc501a8de" class=""><strong>도입 사유</strong><br>
1. 간편한 커스텀 validation 및 errorMessage 렌더링.<br>
2. 압도적으로 짧아지는 코드 길이와 높아지는 함수 컴포넌트의 가독성 확보.</blockquote></details></li></ul><p id="4e13cd3f-6eb2-4e78-8256-904e0531b621" class="">
</p><ul id="70d461fb-db9f-4dd9-b2eb-3388c948f9e6" class="toggle"><details close=""><summary>Prettier + ESLint (CodeConvention)</summary><blockquote id="8a5c69df-e2f8-4f85-b7d4-1264c31d3b88" class=""><strong>도입 사유</strong><br>
1. 형상관리툴을 이용하며, 팀원과 코드를 동기화하는 과정에서 conflict를 최소화하고자 함입니다.<br>
2. conflict의 문제를 떠나, 타인과 협업을 하는 상황에선, codeConvention을 통일해야합니다. 해당 코드의 유지보수와 확장성을 보장하기 위해, 최소한의 “가독성”과 규칙이 전제되어야 하기 때문입니다.  나아가, 더 나은 변수명을 고민하고, 꾸준한 클린코드와 리팩터링을 진행하는 것을 습관화 해야합니다. 내가 작성하는 코드는 부채가 아닌 기술이 되어야합니다. </blockquote></details></li></ul><p id="33b59699-6f4b-4578-af76-06ed25dd6848" class="">
</p><ul id="0546b757-2dd0-4d26-8cfe-dd9f160e0335" class="toggle"><details close=""><summary>husky (CommitConvention)</summary><blockquote id="d3c0de3a-2649-40c4-8a48-19cf0a88b6e7" class=""><strong>도입 사유</strong><br>
- 커밋 로그만 보더라도, 어떤 작업을 했는지 알 수 있어야 합니다.
 특히, 타인과의 협업에서 commit convention을 지키고, 실제 commit 내역과 commit 메시지를 일치해야 함을 인식해야합니다.</blockquote><p id="a7c34d3a-2043-4847-9ae2-57968c160938" class="">
</p></details></li></ul><p id="df3839a3-2466-4f0a-b1e6-6388a76cc236" class="">
</p><ul id="9682b011-9272-4091-b0b7-3477414bb1f8" class="toggle"><details close=""><summary>Vercel (Deploy)</summary><blockquote id="380c07af-d005-480c-871c-2ed700af0e75" class=""><strong>도입 사유</strong><br>
- 원래 계획에는 AWS S3로 배포 후, github action을 이용해 CI/CD를 구축하고자 하였습니다. 다만, 여러가지 문제점이 발생하여, 자체적으로 CI/CD 및 deploy를 제공하는 Vercel을 채택하였습니다. 추후, 위의 환경으로 migration 예정입니다. </blockquote></details></li></ul><p id="4b6f3292-37b5-49db-b5d2-dbe1d512a9ea" class="">
</p><ul id="9daa4599-8326-4d5e-becd-e6e17727c36f" class="toggle"><details close=""><summary>JEST + rtl</summary><blockquote id="90b530db-79af-4e55-9719-c74ff393ee24" class=""><strong>도입 사유</strong><br>
- PR을 날리기 전, 본인이 작성한 코드의 sideEffect를 알 수 있는 도구입니다.
위와 같은 이유로, testCode를 많이 작성하지는 못했지만, 추후 컴포넌트 단위의 테스트코드를 전부 작성할 예정입니다.</blockquote></details></li></ul><p id="a36d19c6-9a71-43da-b6ed-a0b8b6941b41" class="">
</p><ul id="2fa86745-663e-486a-a673-c1866e127183" class="toggle"><details close=""><summary>동시접속제어 - JWT 토큰 방식</summary><blockquote id="414f0f38-8a14-412e-9535-160dc2ec6da9" class=""><strong>도입 사유</strong><br> -  한 회원의 다중 클라이언트를 이용한 동시접속 제어를 하기 위해서 세션을 도입할 것인가, 말 것인가에 대해 회의를 해야 했습니다. <ul id="489b7813-299b-4567-b41a-6cae186da821" class="toggle"><details open=""><summary>세션/ REDIS</summary><ul id="2c10599c-e22a-42d0-937b-e5741c879190" class="bulleted-list"><li style="list-style-type:disc">세션은 stateful한 인증 방식으로 서버에 세션 정보를 저장하여 인증을 유지하기 때문에 서버의 확장성을 낮추고, 서버에 저장된 세션 정보가 많아지면 서버의 메모리 부하가 커지고 서버의 안정성에도 영향을 줄 수 있습니다.</li></ul><ul id="5f4a105e-1ab4-4305-986e-4b334a4c1b2d" class="bulleted-list"><li style="list-style-type:disc">프로젝트의 특성상 다수의 사용자가 동시에 접속하는 경우 서버의 부하가 크게 증가할 수 있습니다. 따라서 대규모 사용자를 처리해야 하는 경우에는 분산 캐시나 다른 기술을 이용하는 것이 더욱 효과적이라고 생각해서 redis를 선택했습니다</li></ul></details></li></ul></blockquote></details></li></ul><p id="a4acaa01-2ccf-4f00-8082-6ff078d78faf" class="">
</p><ul id="d448658a-08a7-4a8e-9783-ccbe68488e13" class="toggle"><details close=""><summary>RefreshToken 관리</summary><blockquote id="f94c7699-d2a0-4920-9cb3-b6c6a1161bc1" class=""><strong>도입 사유</strong><br> -  접속 제어를 위해 REFRESH TOKEN이 필요<ul id="f2803357-2695-453b-9266-80b705869b2d" class="toggle"><details open=""><summary>SPRING DATA JPA / REDIS</summary><ul id="2241d299-d264-46ca-8444-b6006f1511c5" class="bulleted-list"><li style="list-style-type:disc">Spring Data JPA는 객체-관계 매핑(Object-Relational Mapping) 기술을 제공하여, 데이터베이스와 객체를 매핑하여 개발을 용이하게 해주는 프레임워크입니다. 하지만, JPA는 대량의 데이터를 처리할 때 성능 이슈가 있을 수 있습니다.</li></ul><ul id="7ae39b22-4e32-442d-891f-aa9f15fb75b9" class="bulleted-list"><li style="list-style-type:disc">B2B SaaS 서비스에서 접속 제어를 위해 Redis를 사용하는 것은, Refresh Token과 같이 민감한 정보를 안전하게 저장하고, 빠른 속도로 대용량의 데이터를 처리하기 위함입니다. Redis를 이용하면, Refresh Token을 안전하게 저장하고, 유효성 검사를 효율적으로 처리할 수 있으며, 성능이 뛰어나므로 사용자 경험을 향상시킬 수 있습니다.</li></ul><ul id="4ed9e527-2c3c-4b52-9783-3fbe56f88b03" class="bulleted-list"><li style="list-style-type:disc">또한 Redis는 높은 성능, 분산 시스템, 캐시 등의 이점을 제공해 확장가능성도 뛰어났고, 데이터 안정성과 서비스 성능 향상에 효과적이기에 선택했습니다.</li></ul></details></li></ul></blockquote></details></li></ul><p id="e79801bf-088e-45a2-bc2c-caafaf93beb1" class="">
</p><ul id="6c81ac06-d3d5-4b0d-9be0-93bbc8c25452" class="toggle"><details close=""><summary>CI/CD 무중단 배포</summary><blockquote id="b0a2ec33-580d-4c5b-96eb-2572560a9d39" class=""><strong>도입 사유</strong><br> -  기술 개발과 실 서비스 이용자들이 업데이트를 할 때마다 서버가 끊어지지 않고 적용하기 위해 필요<ul id="9e06faa0-d67e-4cdd-8a2e-099b7c33f50e" class="toggle"><details open=""><summary>github action, docker, jenkins, Travis
s3, codeDeploy, Redis, Nginx, Apache, Load Balancing</summary><ul id="1534b4f4-46cf-48f3-8b7c-a855c42e1631" class="bulleted-list"><li style="list-style-type:disc">이미지와 초대부분 때문에 docker container를 활용해 Elastic Clound를 적용시키려고 했으나, 한정적인 비용과 주 목적인 업무틀과 티켓 페이지에는 기본적인 CI/CD를 활용하는 것이 더 맞다고 판단하여 결정했습니다.</li></ul><ul id="e18e9ab9-e8a6-4e50-ba5f-cea7e59be3af" class="bulleted-list"><li style="list-style-type:disc">jenkins, Travis는 자주 꺼진다는 이슈로 안정적인 서버 구축을 위해 CI로는 github action을 선택했습니다.</li></ul><ul id="4fa46a27-391f-48f8-985f-72fa005d36be" class="bulleted-list"><li style="list-style-type:disc">codeDeploy배포 후 업데이트를 진행할 때마다 서버가 내려가는 부분을 고민하다, 가동성과 접근성이 좋은 Nginx를 선택하게 되었습니다. </li></ul><ul id="54e80d6b-0997-45c4-b4b4-db35726cb836" class="bulleted-list"><li style="list-style-type:disc">로드밸런싱의 블루 그린을 이용하여 서버를 여러개 띄워서 오토스케일링을 사용하려고 했으나, 비용적인 문제로 일반을 선택하였습니다.</li></ul></details></li></ul></blockquote></details></li></ul><p id="7e2af250-99b5-47cf-9d30-4c8464bb7d47" class="">
</p><ul id="f501e54f-08c3-411a-9db7-142b162aab60" class="toggle"><details close=""><summary>낙관적 락을 통한 동시성 제어</summary><blockquote id="23057873-5a60-447d-85d9-4048c38cce0d" class=""><strong>도입 사유</strong><br> -  동시성 제어 이슈를 방지하기 위하여 db에 락을 걸어야 했습니다.<ul id="ff7727de-bd5c-4e40-89d5-12d93f77c00a" class="toggle"><details open=""><summary>Pessimistic Lock, MVCC, Optimistic locks3, codeDeploy, Redis, Nginx, Apache, Load Balancing</summary><ul id="6bc5a307-2dc0-4543-afeb-60fbe4b43ae9" class="bulleted-list"><li style="list-style-type:disc">가장 중요했던 ticket의 assign같은 경우 db의 충돌 방지를 위해 락을 걸어주어야 했습니다. MVCC를 걸어 주기엔 MVCC 튜닝에 시간이 너무 많이 소모되고, pessimistic Lock 같은 경우 저희 서비스의 메인 로직 상 빠르게 Assign을 가져가야 하고, 메인 페이지에서 ‘딸깍’이라는 액션 한 번에 수정 작업이 이루어져야 하므로 S-Lock이나 E-Lock 등을 걸어주면서 읽기 작업에 락을 걸만큼의 로직이 아니라고 판단했습니다. 또한 롤백 코스트 또한 많이 나가지 않을 것이라 생각했습니다. 그래서 JPA Auditing을 통해 수정자에 versioning을 걸어주면서 낙관적 락을 구현하게 되었습니다.</li></ul></details></li></ul></blockquote></details></li></ul><p id="727bcb52-718f-4e82-bcf3-70103627d1fc" class="">
</p><ul id="72ebd0a6-03b1-4ba0-85c6-8ce19a911e14" class="toggle"><details close=""><summary>미래지향적 사고</summary><blockquote id="020fa5de-84e7-4f9e-8d95-e3de9690a146" class=""><strong>도입 사유</strong> <br>-  프로젝트의 현재만 보고 달리지 않기 위해 지원이 오래된 라이브러리의 경우 쓰지 않기로 하였습니다.<ul id="72c56bee-80a6-4f1a-9bc1-6f0a2ee3a130" class="toggle"><details open=""><summary>다양한 라이브러리</summary><ul id="630eeccf-e006-4407-bb97-d0742c660bdb" class="bulleted-list"><li style="list-style-type:disc">예를 들어 Mapping framework에도 저희가 사용한 Mapstruct외에도 자바 수동 변환, ModelMapper, Orika, Dozer등과 같은 다양한 라이브러리가 있습니다. 그러나 호환성이나 리플렉션같은 기술적인 부분을 제외하고도, 지원이 오래되거나 중단된 라이브러리, 레퍼런스가 부족한 라이브러리는 장점이 많아도 사용하지 않도록 하기로 했습니다. </li></ul></details></li></ul></blockquote></details></li></ul><p id="fab3f501-720f-4de6-8cdd-436edb9156ce" class="">
</p><ul id="1403f061-84ec-465f-bcb5-ce5f14aa8722" class="toggle"><details close=""><summary>REST를 따르는 설계</summary><blockquote id="d5c2170f-b684-4251-aedc-2ff745732781" class=""><strong>도입 사유</strong><br> -  req, res의 방식에 대해 어떻게 데이터를 주고 받을지에 대해 고민하였습니다<ul id="4e280081-a279-4c6d-88b0-6ba44924891b" class="toggle"><details open=""><summary>HATEOAS</summary><ul id="e5edb307-77c7-4fe1-8a2a-3e13fc130510" class="bulleted-list"><li style="list-style-type:disc">Rest 아키텍쳐 스타일을 구성하는 스타일은 아래와 같습니다.
- stateless
- cache
- uniform interface
- layered system
- code-on-demand(optional)</li></ul><ul id="c3cce1ef-dbed-43f9-808d-1f88963b6fa1" class="bulleted-list"><li style="list-style-type:disc">이 중, uniform interface를 따르는 것에서 구성원들의 차이가 있었습니다. 다른 부분에는 만장일치가 있었으나, HATEOAS에 대해서는 의견이 갈렸습니다. springboot hateoas library를 통해 link를 던지려고 했으나, B2B SAAS 프로젝트를 진행하는 만큼 link의 보안성에 대해 민감했기 떄문에 이 이슈는 빼기로 결정하였습니다. </li></ul><ul id="7a0e9f13-5d47-49ac-8012-0b545739a9b7" class="bulleted-list"><li style="list-style-type:disc">또한, 엔드포인트 설계 방식에서 리소스를 잘 나타내 주기 위해 nested된 api를 작성하기 위해 pathvariable로 받던 상위 resource의 id를 dto로 받는 대신 필수조건으로 걸고 valid로 유효성을 검증하였습니다.</li></ul></details></li></ul></blockquote></details></li></ul><p id="0ba8e068-1940-486c-8f62-51590727d29a" class="">
</p><ul id="8c6a63db-e198-427b-86ec-a61c5f68f8ae" class="toggle"><details close=""><summary>기술 - properties 관리</summary><blockquote id="87138de7-09f4-4912-8286-5f84897e41a8" class=""><strong>도입 사유</strong><br> -  어떻게 해야  properties를 비롯한 백엔드 보안 이슈에 더 민감하게 대처할수 있을까 생각하였습니다.<ul id="ca74c527-9c81-4525-b821-cd283e82c54c" class="toggle"><details open=""><summary>GITHUB ACTION / jasypt</summary><ul id="117fc383-d89c-4ac9-aadc-a47ef8179214" class="bulleted-list"><li style="list-style-type:disc">위에서 github action을 사용하기로 결정함에 따라, 인스턴스에 VM옵션을 주어서 가동해야하는 jasypt방식 대신에 깃허브 액션에서 프로퍼티를 관리하기로 하였습니다.</li></ul></details></li></ul></blockquote></details></li></ul><p id="a1cdd33e-6269-4857-9ecb-d60798a2270c" class="">
</p><ul id="b558b0f9-219d-4d6f-abca-aae959237da4" class="toggle"><details close=""><summary>공통 Response 처리</summary><blockquote id="3b61b2d1-428d-47cb-9979-379f21acc86c" class=""><strong>도입 사유</strong><br> -  어떻게 해야 조금 더 uniformed된 resp를 줄 수 있을까 생각하였습니다.<ul id="a60236c2-8fb6-45c0-9c51-fc058c47de3c" class="toggle"><details open=""><summary>globalResponse</summary><ul id="8dab016b-4f16-4ec8-b1f3-6360663a9c54" class="bulleted-list"><li style="list-style-type:disc">resp에 대해서는 에러코드와 마찬가지로 status, message, data의 3가지 필드를 만들고 반환하는 데이터를 넣으려고 했으나, 프론트에서 depth를 하나 더 늘리는 것을 선호하지 않았습니다. </li></ul><ul id="2be92166-6590-4727-b47e-037f54dcb0b6" class="bulleted-list"><li style="list-style-type:disc">그렇다고 일일히 dto에 mapping framework을 이용해 @AfterMapping 어노테이션으로 추가적인 정보를 넣어주는것은 비효율적이라고 느껴서, error가 아닌 200, 201 코드를 반환할 때에는 one-depth로 변화되는 값의 전체 데이터를 넣어 주었습니다.</li></ul></details></li></ul></blockquote></details></li></ul><p id="43a67730-dc0b-4470-91de-72bb8b730e4a" class="">

---

# 💥 트러블 슈팅

토글을 클릭하시면 더 자세한 트러블 슈팅을 보실 수 있습니다.

### ⭐ FRONT END

### ⭐ BACK END

🔴오브젝트 캐싱<blockquote id="2db5c6ba-4523-48d4-81d8-b05e39556322" class="">어떻게 해야 db 출입을 조금 더 줄일수 있을것인가에 대해 고민했습니다.</blockquote><ul id="1c353e56-805f-402b-a33b-64a759ca92b2" class="toggle"><details close=""><summary>Redis template</summary><ul id="bd0a641f-07de-4017-9173-0fbaf9fe1efe" class="bulleted-list"><li style="list-style-type:disc">@AuthenticationPrincipal에 사용되는 유저 확인 쿼리가 모든곳에 필요로 하기에 이를 절약하려고 Redis template를 가용했습니다. 그러나 다음과 같은 결과를 반환했습니다.<pre id="5b7550ec-8004-4adc-9248-8ce59b0c83ed" class="code"><code>예)
ProjectService
- createProject
- 실행 메서드 : createProject, 실행 시간 = 212ms (서블릿 처음으로 띄웠을 때)
- 실행 메서드 : createProject, 실행 시간 = 81ms
- 실행 메서드 : createProject, 실행 시간 = 130ms (서블릿 처음 아닐 때)
- 실행 메서드 : createProject, 실행 시간 = 840ms(이미지 등록 시)
- viewProjectAll
- 실행 메서드 : viewProjectAll, 실행 시간 = 171ms (서블릿 처음으로 띄웠을 때)
- 실행 메서드 : viewProjectAll, 실행 시간 = 59ms (캐싱 적용)
- 실행 메서드 : viewProjectAll, 실행 시간 = 48ms (캐싱 미적용)
- viewProjectOne
- 실행 메서드 : viewProjectOne, 실행 시간 = 150ms(서블릿 처음으로 띄웠을 때)
- 실행 메서드 : viewProjectOne, 실행 시간 = 110ms(캐싱 적용)
- 실행 메서드 : viewProjectOne, 실행 시간 = 99ms(캐싱 미적용)</code></pre></li></ul><ul id="2ae53d30-b21b-4810-83f7-695a37ea41da" class="bulleted-list"><li style="list-style-type:disc">모든 실행 메서드에서 UserDetails를 캐싱함에 있어 캐싱을 미적용하는 상태가 latency가 조금 더 빨랐습니다.</li></ul><ul id="06cebdc9-d55f-43c1-ba21-15d1cf4081f8" class="bulleted-list"><li style="list-style-type:disc">Cache hit, Cache config, initial cacheable등을 체크 해 보았으나, 특별한 이슈를 발견하지 못했으므로 캐시 오버헤드에 의한 현상이라고 생각했고, 이와 관련해 JPA의 trensient 에러등을 반환하였으므로 JPA의 관리 밑에 있는 엔티티들은 JPA의 1, 2차캐시 아래 두고, DTO나 같은 상태를 반환해야 하는 오브젝트들을 캐싱하는 것이 맞다고 판단하여 엔티티에 대한 캐싱처리를 하지 않았습니다.</li></ul><p id="2f1d8f60-5dab-47ef-9ae3-f4ff9cffc955" class="">
</p></details></li></ul><p id="b4a8d234-4e47-4fcb-89e3-7231b8c2e592" class="">
</p>
🔴LocalDate와 LocalDateTime을 이용한 동적쿼리 방식<blockquote id="778dbefc-08ab-472c-93cb-61ed632503f4" class="">정확한 데이터를 위해서는 LocalDateTime을 필요로 하지만, ‘날짜’별로 정렬하기 위해서는 LocalDate형식으로 티켓들을 정렬해야 함</blockquote><ul id="1bd359cc-a302-417f-9db2-d99b0d789cf9" class="toggle"><details close=""><summary>1. LocalDate로 형식 통일
2. LocalDateTime을 LocalDate로 변환 후 쿼리문 작성</summary><ul id="e70824c2-73f6-4692-b5dd-dd702c1e01b7" class="bulleted-list"><li style="list-style-type:disc">태스크나 티켓이 언제 만료되느냐는 LocalDate를 활용해 나타내면 편하지만, 언제 이 티켓을 완수했느냐 하는 CompletedAt은 LocalDateTime을 이용해 정확하게 DB에 집어넣어야 한다고 생각했습니다.</li></ul><ul id="f798b968-0001-4d3c-83db-2a03812bcd66" class="bulleted-list"><li style="list-style-type:disc">또한 완수 시간에 따른 가산점수가 있기에 이를 LocalDate 타입을 활용하면 정확한 점수 책정이 되지 않는다고 생각했습니다. 그러나 핵심 로직에는 완료 티켓을 ‘날짜’를 기준으로 책정하기 때문에, 이를 grouping하는 데에서 문제가 생겼습니다.</li></ul><ul id="b1ba5a25-6dbe-4d91-9b04-a9ccd9025ec6" class="bulleted-list"><li style="list-style-type:disc">그래서 QueryDsl이 지원하는 dateTemplate를 이용해 LocalDateTime을 date로 표현해주는 expression을 작성하고, 이를 튜플로 묶어준 후 다시 dto에 집어넣어 반환하는 형태를 취했습니다.
코드는 다음과 같습니다.<pre id="5da4bfcc-d37a-47e0-b92b-6980f2997f97" class="code"><code>@Override
public List&lt;DateTicket&gt; methodName(TicketSearchCondition condition, Long userId){
  DateTemplate&lt;LocalDate&gt; formattedDate = Expressions.dateTemplate(LocalDate.class, “DATE_FORMAT({0}, ‘%y-%m-%d’)”, ticket.completedAt);
  return queryFactory
              .select(formattedDate, ticket.count())
              .from(ticket)
              .where(ticket.user.userId.eq(userId),getWithOneYear(condition.getDate()))
              .groupBy(formattedDate)
              .orderBy(ticket.completedAt.asc())
              .limit(365)
              .fetch()
              .stream()
              .map(tuple → new DateTicket(tuple.get(0, String.class), tuple.get(1,Long.class)))
              .collect(Collectors.toList());</code></pre></li></ul></details></li></ul><p id="3924d7d3-9ef1-4b6a-8efd-3e57c0ca78d3" class="">
</p></details></li></ul>
🔴노출하고 싶지 않은 상세정보<blockquote id="04f1435d-fe3f-4a37-8d45-7edaf2b06eb0" class="">정확한 데이터를 위해서는 LocalDateTime을 필요로 하지만, ‘날짜’별로 정렬하기 위해서는 LocalDate형식으로 티켓들을 정렬해야 함</blockquote><ul id="046e2a98-16de-46a9-b900-7902974b0a9c" class="toggle"><details close=""><summary>1. JSONVIEW
2. DTO 만들기</summary><ul id="e4ba902e-b3e0-48c6-8cd5-2c83ec97533d" class="bulleted-list"><li style="list-style-type:disc">저희 프로젝트는 현재 5중첩된 엔티티 구조를 가지고 있기 때문에 이를 관리하기가 쉽지 않고, 원하는 데이터를 얻으려 를 하나씩 분리하기에는 dto가 너무 많아진다는 단점이 생깁니다. </li></ul><ul id="833fca8e-5b24-419c-a002-fd01b6be8e2c" class="bulleted-list"><li style="list-style-type:disc">Dto 관리를 하려 inner dto로 dto의 state를 관리해주는 방법도 있고, factory pattern으로 dto의 공통적인 부분만을 뽑아내는 방법도 있었으나 저는 클래스가 많아지는것을 우려하여 JSONVIEW방식을 고민하였습니다. </li></ul><ul id="71591622-0828-46b4-aa18-30d70f7e7944" class="bulleted-list"><li style="list-style-type:disc">그러나 JSONVIEW방식에는 문제가 있었던 것이, field가 하나 늘어나거나, 보여주어야 하는 엔티티의 depth별로 어노테이션을 줄줄이 달아주어야 하고, 가장 큰 문제는 db에서 아예 정보를 가져오지 않기를 원했으나 db에서는 관련된 정보를 다 뽑아온 채 serialize만 하지 않는다는 것이었습니다. </li></ul><ul id="e00be006-5ae5-4480-9d9b-8f76bfe2446d" class="bulleted-list"><li style="list-style-type:disc">그래서 이 방식을 rollback하고, 대신 queryprojection을 이용하여 원하는 dto에서 뽑아와 필요없는 정보는 null처리 한 채 정보를 반환하였습니다. 개인적으로는 client에 null을 전달하기 싫었으나, 20가지 field중 한 가지 field만 보내고 싶지 않은데 class를 새로 만드는 것은 너무 비합리적인 방식이라고 생각하였기 때문입니다.</li></ul><p id="7dd45706-3e30-4b85-ba20-7f577e1dd321" class="">
</p></details></li></ul>
🔴트랜잭션 관리(진행중 - 완료시 성능개선탭으로 이동)<blockquote id="75b20148-e72e-46e3-97d5-2091f7d61c7c" class="">동시접속자가 일정 수 이상일 때 latency가 어마어마하게 늘어나는 일</blockquote><ul id="d139b38a-c5c1-4423-a9df-73af7c39a5e0" class="toggle"><details close=""><summary>1. 트랜잭션 모두 켜고, 쓰레드 최적화
2. OSIV 옵션 끄고 상세하게 트랜잭션이 필요할때만 트랜잭션 어노테이션을 켜거나 propagation 이용</summary><ul id="b4797d99-5b19-493c-931d-71dc5b4726f2" class="bulleted-list"><li style="list-style-type:disc">현재 저희 프로젝트는 지연로딩 전략을 이용하고 있어 때로는 N+1 문제가 발생할 수 있습니다. 이를 위해 적절한 FetchJoin과 기본 BatchSize를 구성하였습니다. 성능상의 이점은 있을 수 있겠으나, LazyInitializationException이나 트랜잭션 관리가 어려운 경우 오히려 성능 저하나 data integrity 문제가 발생할 수 있어 일단은 효율적인 개발 진행을 위해 모든 메서드에 @Transactional을 걸어주었지만, 동시접속자가 1000명일 경우 jmeter기준 latency가 30000ms까지 증가하다가 hikaripool에서 커넥션이 말랐다는 오류가 발생합니다.  이를 해결하기 위해서는 다음과 같은 방향성이 필요합니다.<pre id="f3f210f6-151b-4feb-bfce-c1e2e50d69af" class="code"><code>1. pool size 늘리기
2. connection timeout 늘리기
3. transaction의 적절한 사용</code></pre></li></ul><ul id="320192a0-3943-4a93-aaf6-f7b25d55acc2" class="bulleted-list"><li style="list-style-type:disc">1, 2번을 적용하였을 경우 해당 오류는 나아졌으나 임시방편이라고 생각하여 트랜잭션이 꼭 필요한 순간만 트랜잭션을 적용시키려고 합니다. 그러나 모든 API에 대해 확인절차를 거쳐야 하기때문에 조금은 후순위로 미루고 다른 작업을 진행 중에 있습니다.</li></ul><p id="6cafef28-4e9d-4cae-9efa-e9074e27cf15" class="">
</p></details></li></ul>
🔴CI 구성 실패<blockquote id="c6fb3f08-4ac4-415e-9e8c-a7900d8765f3" class="">디렉토리 안에 Build 파일이 들어있어 인식하지 못해 Build 실패</blockquote><ul id="a1705672-7984-4312-9691-d25a02b4fcb1" class="toggle"><details close=""><summary>1. Build파일 이동
2. 레포 다시 만들기</summary><ul id="ba8ba16c-9ab6-4448-a244-d179d660f053" class="bulleted-list"><li style="list-style-type:disc">해당문제는 깃허브에서 Repository를 만들고 디렉토리를 만들어서 그 안에서 시작해서 action이 인식하지 못해 발생한 문제로, build.gradle을 디렉토리 밖으로 이동시 작동하나, application.yml의 위치를 따로 지정해줘도 제대로 인식하지 못해 Repository를 다시 만들어 적용시켜 해결했습니다.<figure id="7cf8e235-93c7-4d45-8f0c-cc16644724a2" class="image"><a href="%E1%84%84%E1%85%A1%E1%86%AF%E1%84%81%E1%85%A1%E1%86%A8%20DDAL-GGAK%205d44eae726a0475bbe78e467482db4fd/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2023-03-28_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%258C%25E1%2585%25A5%25E1%2586%25AB_11.18.23.png"><img style="width:459px" src="%E1%84%84%E1%85%A1%E1%86%AF%E1%84%81%E1%85%A1%E1%86%A8%20DDAL-GGAK%205d44eae726a0475bbe78e467482db4fd/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2023-03-28_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%258C%25E1%2585%25A5%25E1%2586%25AB_11.18.23.png"/></a></figure></li></ul></details></li></ul>
🔴CodeDeploy - SQL 오류<blockquote id="e3b29abe-6a06-4b96-9eec-b27711ee3bc7" class="">코드 자동배포화를 하면서 생긴 오류 </blockquote><ol type="1" id="f8aced17-3b39-43d6-a13e-1af6fe4f2f49" class="numbered-list" start="1"><li><pre id="83d83935-5534-4147-b742-5bf88d3fab2f" class="code"><code>HikariPool-1 - Exception during pool initialization. com.mysql.cj.jdbc.exceptions.CommunicationsException: Communications link failure</code></pre><ul id="8e3980df-c3c3-409f-8030-8cc923821955" class="bulleted-list"><li style="list-style-type:disc"></li></ul></li></ol>
🔴로드 밸런서<blockquote id="009b0c00-77ff-4ed2-92d3-0388c75196d1" class="">Health Check : Health check path 404 오류 발생하여 https로 리다이렉트가 되지 않음</blockquote><ul id="04e854b7-92bb-444d-89d0-06bb820cb673" class="toggle"><details close=""><summary>1. Health check path 번호 or 주소 변경
2. Spring Security Filer 예외처리</summary><ul id="0b4b7afb-b44e-46e1-95b5-27bab2231acd" class="bulleted-list"><li style="list-style-type:disc">Health Check : Spring Security로 인해 체크하고자 했던 /health 가 나오지 않아 Health check path가 존재하지 않거나 잘못된 경로를 가리키고 있어 404 오류가 계속해서 발생하여 https로 리다이렉트가 되지 않아 <code>SecurityFilterChain</code> 에 접근가능하도록 /health 허용하였습니다.
</li></ul></details></li></ul>
🔴SSL 인증서 - 호스팅 영역</figure><blockquote id="572d88d4-ae8a-4232-a728-988d6804cfc5" class="">502 bad gateway</blockquote><ul id="d02acc24-b33e-4c23-b3e6-744b30e61105" class="toggle"><details close=""><summary>1.  SSL 인증서 다시 발급</summary><ul id="626ee3b3-66d8-4b08-b7c9-07c690055d37" class="bulleted-list"><li style="list-style-type:disc">Health Check를 통과 했음에도 새로 고침시 발생했다 안했다가 계속 나타났고, 다른 사람들은 접근이 되지 않아 SSL 인증서를 다시 발급받아 적용시켜 해결하였습니다.</li></ul></details></li></ul><p id="091e5e3d-6d99-4745-adce-0b0284124dcf" class="">
</p>
🔴인스턴스 시작 실패<blockquote id="04c49c3b-abe6-4ab2-b2dd-3361bd319c52" class="">CPU가 높아져 인스턴스 상태이상 발생</blockquote><ul id="724018b0-aebd-4c01-ba2f-42f21e0a6357" class="toggle"><details close=""><summary>1. CloudWatch를 사용
2. 인스턴스 용량 UP</summary><ul id="65160be3-9fa3-495b-b1f3-026694507555" class="bulleted-list"><li style="list-style-type:disc">주기적으로 관찰한 결과 메모리의 양이 60~70에서 번갈아가면서 나타났으며, 인스턴스 용량을 t2.medium 업그레이드 시킨 후 문제가 발생하지 않았고, 주기적으로 관찰 하고 있습니다.</li></ul></details></li></ul><p id="1757d07f-6ec8-402a-a219-e5ca0921e159" class="">
</p>
🔴보안 문제 &amp; 서버운영 문제<blockquote id="f9afe97f-2ad1-4a96-9630-3bf58e415f27" class="">서버의 보완 문제 proxy를 사용할지에 여부  
codedeploy만 사용시 업데이트 시 멈춤 현상</blockquote><ul id="5e9a00e2-c15e-4119-a848-322fa10cf784" class="toggle"><details close=""><summary>1. proxy를 따로 설정
2. nginx를 설정하여 proxy를 함께 가동</summary><ul id="a2d8aa44-1957-44e6-9de9-4e6eb414188e" class="bulleted-list"><li style="list-style-type:disc">nginx를 선택하게 된 원인이기도 합니다. </li></ul><ul id="3303ed82-8040-4942-bdb2-04455034111b" class="bulleted-list"><li style="list-style-type:disc">내부에서 Spring Security로 보완을 했다고 하더라도 서버에서 따로 처리가 필요했고, 기존 codedelpoy만 사용해서 업데이트시 서버의 멈춤 현상을 막기 위해 선택하게 되었습니다.
<figure id="453a12dd-023b-401e-a13d-fb07d46402de" class="image"><a href="%E1%84%84%E1%85%A1%E1%86%AF%E1%84%81%E1%85%A1%E1%86%A8%20DDAL-GGAK%205d44eae726a0475bbe78e467482db4fd/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2023-04-17_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%258C%25E1%2585%25A5%25E1%2586%25AB_10.30.31.png"><img style="width:240px" src="%E1%84%84%E1%85%A1%E1%86%AF%E1%84%81%E1%85%A1%E1%86%A8%20DDAL-GGAK%205d44eae726a0475bbe78e467482db4fd/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2023-04-17_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%258C%25E1%2585%25A5%25E1%2586%25AB_10.30.31.png"/></a></figure><figure id="8e33e3ea-ff8e-40f7-8e67-beb6edb41e7c" class="image"><a href="%E1%84%84%E1%85%A1%E1%86%AF%E1%84%81%E1%85%A1%E1%86%A8%20DDAL-GGAK%205d44eae726a0475bbe78e467482db4fd/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2023-04-17_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%258C%25E1%2585%25A5%25E1%2586%25AB_10.31.13.png"><img style="width:240px" src="%E1%84%84%E1%85%A1%E1%86%AF%E1%84%81%E1%85%A1%E1%86%A8%20DDAL-GGAK%205d44eae726a0475bbe78e467482db4fd/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2023-04-17_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%258C%25E1%2585%25A5%25E1%2586%25AB_10.31.13.png"/></a></figure></li></ul></details></li></ul>
🔴nginx 스크립트 실행 문제<blockquote id="6b25fdd5-a464-456d-9918-d930b28a1a58" class="">로컬과 서버 직접 테스트를 통해 작동 확인 후 Github action에 적용시켜 실행시켰지만, 인스턴스 주소를 인식하지 못하거나 8081과 8082로 넘어가는 과정에서 8082에 set2가 나타나지 않아 넘어가지 않은 문제발생</blockquote><ul id="7f552d67-7bd3-443e-b016-279309b55958" class="toggle"><details close=""><summary>1.  스크립트에 직접 입력
2. Spring Security Filer 예외처리
3. 설정 test controller 변경 </summary><ul id="20c07437-3290-40ee-99b7-3ca87c3bdcbf" class="bulleted-list"><li style="list-style-type:disc">계속해서 상태체크를 하고 있는 중 인스턴스 주소를 깃허브 액션 비밀키에 넣어 실행시켰지만, <a href="http://8081로">http://8081로</a> 인식하는 상태가 계속되어 스트립트에 직접 입력하고 서버에 넣어두었습니다.</li></ul><ul id="9f92b6f5-55a0-4ba8-9cd7-2fb30f72394d" class="bulleted-list"><li style="list-style-type:disc">Securityconfig에 업데이트가 되지 않아 발생했던 문제로 Spring Security Filer 예외처리를 변경해주어 실행 확인했습니다.<figure id="6579e5a7-7869-49e7-9abd-b8ea4a2f1f14" class="image"><a href="%E1%84%84%E1%85%A1%E1%86%AF%E1%84%81%E1%85%A1%E1%86%A8%20DDAL-GGAK%205d44eae726a0475bbe78e467482db4fd/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2023-04-11_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%2592%25E1%2585%25AE_4.54.32.png"><img style="width:432px" src="%E1%84%84%E1%85%A1%E1%86%AF%E1%84%81%E1%85%A1%E1%86%A8%20DDAL-GGAK%205d44eae726a0475bbe78e467482db4fd/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2023-04-11_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%2592%25E1%2585%25AE_4.54.32.png"/></a></figure><figure id="0938d46c-13ec-46c7-9b94-e01aa578cc20" class="image"><a href="%E1%84%84%E1%85%A1%E1%86%AF%E1%84%81%E1%85%A1%E1%86%A8%20DDAL-GGAK%205d44eae726a0475bbe78e467482db4fd/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2023-04-11_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%2592%25E1%2585%25AE_4.54.38.png"><img style="width:436px" src="%E1%84%84%E1%85%A1%E1%86%AF%E1%84%81%E1%85%A1%E1%86%A8%20DDAL-GGAK%205d44eae726a0475bbe78e467482db4fd/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2023-04-11_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%2592%25E1%2585%25AE_4.54.38.png"/></a></figure></li></ul></details></li></ul><p id="8f3c0464-2d2d-4a6a-9652-a6c578654e19" class="">
</p>
🔴로그아웃<blockquote id="a61ba696-15ed-45cc-8a96-1443da82b9c0" class="">Method 사용과 사용자 확인 절차 확인 여부</blockquote><ul id="5ae01315-e978-4041-a7b3-09260cb8d5a6" class="toggle"><details close=""><summary>1. GET method 사용
2. token값 유효성 검사</summary><ul id="cad08f72-537f-47a2-8bd8-a98f1a9a4c4f" class="bulleted-list"><li style="list-style-type:disc">기존 토큰을 확인해서 인증되지 않은 사용자가 다른 사용자의 계정을 로그아웃하는 등의 보안 위협 방지</li></ul><ul id="548d3cba-20bb-494a-8049-f070e810924b" class="bulleted-list"><li style="list-style-type:disc">단순 GET 요청으로 동작할 수 있지만 prefetch라는 기술로 인해 부작용이 생길 수 있습니다.</li></ul><ul id="1c2313c7-516a-4caa-88ba-75e7a56b0b22" class="bulleted-list"><li style="list-style-type:disc">prefetch = 사용자를 위해 GET 링크를 미리 가져와 사용자가 해당 링크를 클릭했을 때 즉시 제공함으로써 페이지 로딩 시간을 줄이는 프로세스입니다.</li></ul><ul id="caa5c5c4-fd7d-4762-b6b7-4aad2122abbf" class="bulleted-list"><li style="list-style-type:disc">페이지에서 링크를 미리 가져오려고 시도하는 도중에 사용자가 로그아웃을 누르지 않아도 로그아웃이 될 수 있다. 그래서 POST 메서드를 사용했습니다.</li></ul><p id="3cf90b2b-eef4-4360-b78a-84b947cc2d8a" class="">
</p></details></li></ul>
🔴Redis<blockquote id="2646b622-5829-43e7-8e68-89c320dec91c" class="">Redis Repository / Redis Template에 대한 고민</blockquote><ul id="21be268f-bea5-46f0-a66b-23176b58eed1" class="toggle"><details close=""><summary>Redis Repository</summary><ul id="f34eb150-67bc-4fec-9539-1ebb3116d0fd" class="bulleted-list"><li style="list-style-type:disc">예상한 기능에서는 AccessToken, RefreshToken관리와 email 인증코드 관리기능이 있었다. 해당 내용은 Redis Repository만으로도 충분한 구현이 가능하고 추후 RedisTemplate을 추가한다고 해도 확장성이 크게 떨어지지 않을 것이라 판단해서 RedisRepository를 적용했다.</li></ul><ul id="69763e52-38ca-4ea7-83d7-f96e73dc4897" class="bulleted-list"><li style="list-style-type:disc">적용 중에 있었던 에러사항은 아래와 같다.
Redis 에 사용할 객체의 <code>@Id</code> 어노테이션 (JPA 에서 사용하는 <code>@Id</code> 를 임포트 X)
<code>javax.persistence.Id</code> 대신 <code>org.springframework.data.annotation.Id</code> 을 임포트 할 것
Redis는 ID를 자동 부여하는 기능을 지원하지 않는다.
RedisRepoitory는 CRUD repository를 상속하기에 CURD repository가 지원하는 기능만 사용 가능하다.</li></ul></details></li></ul><p id="b35d72f2-6715-409a-a4c3-e40605325336" class="">
</p><p id="655ff1a4-e9c3-43dd-875f-b7f675828cff" class="">
</p><p id="eb0efee5-79c3-4a9e-a24a-df2404b4269c" class="">
</p><p id="8ca7dda0-5c4d-4c51-b6aa-a3de2ac9f8fb" class="">
</p>

---

# 👥팀원 git hub

|포지션|이름|깃허브 주소|
|:---:|---|---|
|<center>FE</center>|김대현|[https://github.com/pengooseDev](https://github.com/pengooseDev)|
|<center>FE</center>|박지현|[https://github.com/Taffymark1](https://github.com/Taffymark1)|
|<center>BE</center>|조영준|[https://github.com/choincnp](https://github.com/choincnp)|
|<center>BE</center>|박현아|[https://github.com/aihtnyc-h](https://github.com/aihtnyc-h)|
|<center>BE</center>|박성민|[https://github.com/seongminnnn](https://github.com/seongminnnn)|

