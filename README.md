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

토글을 클릭하시면 자세한 채택 이유를 보실 수 있습니다.

- React
    
    > **도입 사유**
    1. State 변경에 따른 반응성 유지.
    2. 함수 컴포넌트를 사용한 컴포넌트 재사용성 증대.
    > 

- Redux
    
    > **도입 사유** 
    클라이언트의 state 관리 및 Provider pattern을 이용한 컴포넌트 간 불필요한 의존성을 제거하고 재사용성 확보.
    > 
    > - redux, recoil, zustand 등
    >     - 현재 프로젝트 상태만 보면 recoil을 사용하는 것이 맞으나, 최종적으로 만들고자 하는 프로덕트는 B2B SaaS이기 때문에 결국 프로덕트의 규모는 굉장히 커질 예정입니다.
    >      따라서, 초반에 작성해야 할 코드가 좀 있겠지만, 나중의 스케일업에 대한 유동성을 고려해본다면 redux로 상태를 관리하는 것이 옳다고 판단했습니다.

- react-query
    
    > **도입 사유** 
    1. 데이터 캐싱을 이용한 쾌적한 렌더링.
    2. BE와의 데이터 동기화.
    3. HTTP 프로토콜 통신 결과 핸들링.
    > 
    > - swr, react-query
    >     - redux-thunk는 FE의 middleware이지 HTTP 프로토콜 통신을 담당하기 위해 나온 라이브러리는 아니기 때문에 고려대상에서 배제하였습니다.
    >     - 현재는 react-query나 swr, 나아가 NextJS 13 버젼 등. 데이터 캐싱과 BE데이터 동기화에 관한 뛰어난 성능을 제공하는 라이브러리 및 프레임워크가 많이 출시되었으며, 커스텀 캐싱 및 BE와의 데이터 동기화에 성능이 뛰어난 react-query를 채택하였습니다.

- Typescript
    
    > **도입 사유** 
    1. type을 통한 안정성 확보.
    2. 미처 잡아내지 못한 에러 디버깅.
    3. 자동완성 기능.
    > 

- styled-components
    
    > **도입 사유**
    1. 외부 환경변화에 따른 유동적 대처가 가능.
    2. 함수 컴포넌트에 여러 props를 전달하더라도 복잡한 optional rendering을 제어할 수 있음.
    3. 전역적으로 스타일링에 대한 책임을 담당하고 책임을 부여.
    > 
    > - TailwindCSS
    >     
    >     기본적으로 적용된 CSS 프리셋이 있어 간편하다는 장점이 있지만, props를 통해 optional하게 CSS를 적용할 경우, 가독성이 크게 떨어진다는 문제점이 있습니다. 또한, 이것과 더불어 전역적인 style 적용에도 어려움이 있습니다.
    >      결국, 외부환경의 변화에 유동적으로 대처하며, 복잡하고 상세한 CSS를 적용하고자 styled-components를 채택하였습니다.
    >     

- react-hook-form
    
    > **도입 사유**
    1. 간편한 커스텀 validation 및 errorMessage 렌더링.
    2. 압도적으로 짧아지는 코드 길이와 높아지는 함수 컴포넌트의 가독성 확보.
    > 

- Prettier + ESLint (CodeConvention)
    
    > **도입 사유**
    1. 형상관리툴을 이용하며, 팀원과 코드를 동기화하는 과정에서 conflict를 최소화하고자 함입니다.
    2. conflict의 문제를 떠나, 타인과 협업을 하는 상황에선, codeConvention을 통일해야합니다. 해당 코드의 유지보수와 확장성을 보장하기 위해, 최소한의 “가독성”과 규칙이 전제되어야 하기 때문입니다.  나아가, 더 나은 변수명을 고민하고, 꾸준한 클린코드와 리팩터링을 진행하는 것을 습관화 해야합니다. 내가 작성하는 코드는 부채가 아닌 기술이 되어야합니다.
    > 

- husky (CommitConvention)
    
    > **도입 사유**
     커밋 로그만 보더라도, 어떤 작업을 했는지 알 수 있어야 합니다.
     특히, 타인과의 협업에서 commit convention을 지키고, 실제 commit 내역과 commit 메시지를 일치해야 함을 인식해야합니다.
    > 
    

- Vercel (Deploy)
    
    > **도입 사유**
     원래 계획에는 AWS S3로 배포 후, github action을 이용해 CI/CD를 구축하고자 하였습니다. 다만, 여러가지 문제점이 발생하여, 자체적으로 CI/CD 및 deploy를 제공하는 Vercel을 채택하였습니다. 추후, 위의 환경으로 migration 예정입니다.
    > 

- JEST + rtl
    
    > **도입 사유**
     PR을 날리기 전, 본인이 작성한 코드의 sideEffect를 알 수 있는 도구입니다.
    위와 같은 이유로, testCode를 많이 작성하지는 못했지만, 추후 컴포넌트 단위의 테스트코드를 전부 작성할 예정입니다.
    > 

- 기술 - 동시접속제어 - JWT 토큰 방식
    
    > 도입 사유 -  한 회원의 다중 클라이언트를 이용한 동시접속 제어를 하기 위해서 세션을 도입할 것인가, 말 것인가에 대해 회의를 해야 했습니다.
    > 
    > - 세션/ REDIS
    >     - 세션은 stateful한 인증 방식으로 서버에 세션 정보를 저장하여 인증을 유지하기 때문에 서버의 확장성을 낮추고, 서버에 저장된 세션 정보가 많아지면 서버의 메모리 부하가 커지고 서버의 안정성에도 영향을 줄 수 있습니다.
    >     - 프로젝트의 특성상 다수의 사용자가 동시에 접속하는 경우 서버의 부하가 크게 증가할 수 있습니다. 따라서 대규모 사용자를 처리해야 하는 경우에는 분산 캐시나 다른 기술을 이용하는 것이 더욱 효과적이라고 생각해서 redis를 선택했습니다

- 기술 - RefreshToken 관리
    
    > 도입 사유 -  접속 제어를 위해 REFRESH TOKEN이 필요
    > 
    > - SPRING DATA JPA / REDIS
    >     - Spring Data JPA는 객체-관계 매핑(Object-Relational Mapping) 기술을 제공하여, 데이터베이스와 객체를 매핑하여 개발을 용이하게 해주는 프레임워크입니다. 하지만, JPA는 대량의 데이터를 처리할 때 성능 이슈가 있을 수 있습니다.
    >     - B2B SaaS 서비스에서 접속 제어를 위해 Redis를 사용하는 것은, Refresh Token과 같이 민감한 정보를 안전하게 저장하고, 빠른 속도로 대용량의 데이터를 처리하기 위함입니다. Redis를 이용하면, Refresh Token을 안전하게 저장하고, 유효성 검사를 효율적으로 처리할 수 있으며, 성능이 뛰어나므로 사용자 경험을 향상시킬 수 있습니다.
    >     - 또한 Redis는 높은 성능, 분산 시스템, 캐시 등의 이점을 제공해 확장가능성도 뛰어났고, 데이터 안정성과 서비스 성능 향상에 효과적이기에 선택했습니다.

- 기술 - CI/CD 무중단 배포
    
    > 도입 사유 -  기술 개발과 실 서비스 이용자들이 업데이트를 할 때마다 서버가 끊어지지 않고 적용하기 위해 필요
    > 
    > - github action, docker, jenkins, Travis
    > s3, codeDeploy, Redis, Nginx, Apache, Load Balancing
    >     - 이미지와 초대부분 때문에 docker container를 활용해 Elastic Clound를 적용시키려고 했으나, 한정적인 비용과 주 목적인 업무틀과 티켓 페이지에는 기본적인 CI/CD를 활용하는 것이 더 맞다고 판단하여 결정했습니다.
    >     - jenkins, Travis는 자주 꺼진다는 이슈로 안정적인 서버 구축을 위해 CI로는 github action을 선택했습니다.
    >     - codeDeploy배포 후 업데이트를 진행할 때마다 서버가 내려가는 부분을 고민하다, 가동성과 접근성이 좋은 Nginx를 선택하게 되었습니다.
    >     - 로드밸런싱의 블루 그린을 이용하여 서버를 여러개 띄워서 오토스케일링을 사용하려고 했으나, 비용적인 문제로 일반을 선택하였습니다.

- 기술 - 낙관적 락을 통한 동시성 제어
    
    > 도입 사유 -  동시성 제어 이슈를 방지하기 위하여 db에 락을 걸어야 했습니다.
    > 
    > - Pessimistic Lock, MVCC, Optimistic locks3, codeDeploy, Redis, Nginx, Apache, Load Balancing
    >     - 가장 중요했던 ticket의 assign같은 경우 db의 충돌 방지를 위해 락을 걸어주어야 했습니다. MVCC를 걸어 주기엔 MVCC 튜닝에 시간이 너무 많이 소모되고, pessimistic Lock 같은 경우 저희 서비스의 메인 로직 상 빠르게 Assign을 가져가야 하고, 메인 페이지에서 ‘딸깍’이라는 액션 한 번에 수정 작업이 이루어져야 하므로 S-Lock이나 E-Lock 등을 걸어주면서 읽기 작업에 락을 걸만큼의 로직이 아니라고 판단했습니다. 또한 롤백 코스트 또한 많이 나가지 않을 것이라 생각했습니다. 그래서 JPA Auditing을 통해 수정자에 versioning을 걸어주면서 낙관적 락을 구현하게 되었습니다.

- 기술 - 미래지향적 사고
    
    > 도입 사유 -  프로젝트의 현재만 보고 달리지 않기 위해 지원이 오래된 라이브러리의 경우 쓰지 않기로 하였습니다.
    > 
    > - 다양한 라이브러리
    >     - 예를 들어 Mapping framework에도 저희가 사용한 Mapstruct외에도 자바 수동 변환, ModelMapper, Orika, Dozer등과 같은 다양한 라이브러리가 있습니다. 그러나 호환성이나 리플렉션같은 기술적인 부분을 제외하고도, 지원이 오래되거나 중단된 라이브러리, 레퍼런스가 부족한 라이브러리는 장점이 많아도 사용하지 않도록 하기로 했습니다.

- 기술 - REST를 따르는 설계
    
    > 도입 사유 -  req, res의 방식에 대해 어떻게 데이터를 주고 받을지에 대해 고민하였습니다
    > 
    > - HATEOAS
    >     - Rest 아키텍쳐 스타일을 구성하는 스타일은 아래와 같습니다.
    >     - stateless
    >     - cache
    >     - uniform interface
    >     - layered system
    >     - code-on-demand(optional)
    >     - 이 중, uniform interface를 따르는 것에서 구성원들의 차이가 있었습니다. 다른 부분에는 만장일치가 있었으나, HATEOAS에 대해서는 의견이 갈렸습니다. springboot hateoas library를 통해 link를 던지려고 했으나, B2B SAAS 프로젝트를 진행하는 만큼 link의 보안성에 대해 민감했기 떄문에 이 이슈는 빼기로 결정하였습니다.
    >     - 또한, 엔드포인트 설계 방식에서 리소스를 잘 나타내 주기 위해 nested된 api를 작성하기 위해 pathvariable로 받던 상위 resource의 id를 dto로 받는 대신 필수조건으로 걸고 valid로 유효성을 검증하였습니다.

- 기술 - properties 관리
    
    > 도입 사유 -  어떻게 해야  properties를 비롯한 백엔드 보안 이슈에 더 민감하게 대처할수 있을까 생각하였습니다.
    > 
    > - GITHUB ACTION / jasypt
    >     - 위에서 github action을 사용하기로 결정함에 따라, 인스턴스에 VM옵션을 주어서 가동해야하는 jasypt방식 대신에 깃허브 액션에서 프로퍼티를 관리하기로 하였습니다.

- 기술 - 공통 Response 처리
    
    > 도입 사유 -  어떻게 해야 조금 더 uniformed된 resp를 줄 수 있을까 생각하였습니다.
    > 
    > - globalResponse
    >     - resp에 대해서는 에러코드와 마찬가지로 status, message, data의 3가지 필드를 만들고 반환하는 데이터를 넣으려고 했으나, 프론트에서 depth를 하나 더 늘리는 것을 선호하지 않았습니다.
    >     - 그렇다고 일일히 dto에 mapping framework을 이용해 @AfterMapping 어노테이션으로 추가적인 정보를 넣어주는것은 비효율적이라고 느껴서, error가 아닌 200, 201 코드를 반환할 때에는 one-depth로 변화되는 값의 전체 데이터를 넣어 주었습니다.

---

# 💥 트러블 슈팅

토글을 클릭하시면 더 자세한 트러블 슈팅을 보실 수 있습니다.

### ⭐ FRONT END

### ⭐ BACK END

<aside>
🔴 오브젝트 캐싱

</aside>

> 어떻게 해야 db 출입을 조금 더 줄일수 있을것인가에 대해 고민했습니다.
> 
- Redis template
    - @AuthenticationPrincipal에 사용되는 유저 확인 쿼리가 모든곳에 필요로 하기에 이를 절약하려고 Redis template를 가용했습니다. 그러나 다음과 같은 결과를 반환했습니다.
        
        ```
        예)
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
        - 실행 메서드 : viewProjectOne, 실행 시간 = 99ms(캐싱 미적용)
        ```
        
    - 모든 실행 메서드에서 UserDetails를 캐싱함에 있어 캐싱을 미적용하는 상태가 latency가 조금 더 빨랐습니다.
    - Cache hit, Cache config, initial cacheable등을 체크 해 보았으나, 특별한 이슈를 발견하지 못했으므로 캐시 오버헤드에 의한 현상이라고 생각했고, 이와 관련해 JPA의 trensient 에러등을 반환하였으므로 JPA의 관리 밑에 있는 엔티티들은 JPA의 1, 2차캐시 아래 두고, DTO나 같은 상태를 반환해야 하는 오브젝트들을 캐싱하는 것이 맞다고 판단하여 엔티티에 대한 캐싱처리를 하지 않았습니다.
    

<aside>
🔴 LocalDate와 LocalDateTime을 이용한 동적쿼리 방식

</aside>

> 정확한 데이터를 위해서는 LocalDateTime을 필요로 하지만, ‘날짜’별로 정렬하기 위해서는 LocalDate형식으로 티켓들을 정렬해야 함
> 
- 1. LocalDate로 형식 통일
2. LocalDateTime을 LocalDate로 변환 후 쿼리문 작성
    - 태스크나 티켓이 언제 만료되느냐는 LocalDate를 활용해 나타내면 편하지만, 언제 이 티켓을 완수했느냐 하는 CompletedAt은 LocalDateTime을 이용해 정확하게 DB에 집어넣어야 한다고 생각했습니다.
    - 또한 완수 시간에 따른 가산점수가 있기에 이를 LocalDate 타입을 활용하면 정확한 점수 책정이 되지 않는다고 생각했습니다. 그러나 핵심 로직에는 완료 티켓을 ‘날짜’를 기준으로 책정하기 때문에, 이를 grouping하는 데에서 문제가 생겼습니다.
    - 그래서 QueryDsl이 지원하는 dateTemplate를 이용해 LocalDateTime을 date로 표현해주는 expression을 작성하고, 이를 튜플로 묶어준 후 다시 dto에 집어넣어 반환하는 형태를 취했습니다.
    코드는 다음과 같습니다.
        
        ```java
        @Override
        public List<DateTicket> methodName(TicketSearchCondition condition, Long userId){
          DateTemplate<LocalDate> formattedDate = Expressions.dateTemplate(LocalDate.class, “DATE_FORMAT({0}, ‘%y-%m-%d’)”, ticket.completedAt);
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
                      .collect(Collectors.toList());
        ```
        

<aside>
🔴 노출하고 싶지 않은 상세정보

</aside>

> 정확한 데이터를 위해서는 LocalDateTime을 필요로 하지만, ‘날짜’별로 정렬하기 위해서는 LocalDate형식으로 티켓들을 정렬해야 함
> 
- 1. JSONVIEW
2. DTO 만들기
    - 저희 프로젝트는 현재 5중첩된 엔티티 구조를 가지고 있기 때문에 이를 관리하기가 쉽지 않고, 원하는 데이터를 얻으려 를 하나씩 분리하기에는 dto가 너무 많아진다는 단점이 생깁니다.
    - Dto 관리를 하려 inner dto로 dto의 state를 관리해주는 방법도 있고, factory pattern으로 dto의 공통적인 부분만을 뽑아내는 방법도 있었으나 저는 클래스가 많아지는것을 우려하여 JSONVIEW방식을 고민하였습니다.
    - 그러나 JSONVIEW방식에는 문제가 있었던 것이, field가 하나 늘어나거나, 보여주어야 하는 엔티티의 depth별로 어노테이션을 줄줄이 달아주어야 하고, 가장 큰 문제는 db에서 아예 정보를 가져오지 않기를 원했으나 db에서는 관련된 정보를 다 뽑아온 채 serialize만 하지 않는다는 것이었습니다.
    - 그래서 이 방식을 rollback하고, 대신 queryprojection을 이용하여 원하는 dto에서 뽑아와 필요없는 정보는 null처리 한 채 정보를 반환하였습니다. 개인적으로는 client에 null을 전달하기 싫었으나, 20가지 field중 한 가지 field만 보내고 싶지 않은데 class를 새로 만드는 것은 너무 비합리적인 방식이라고 생각하였기 때문입니다.
    

<aside>
🔴 트랜잭션 관리(진행중 - 완료시 성능개선탭으로 이동)

</aside>

> 동시접속자가 일정 수 이상일 때 latency가 어마어마하게 늘어나는 일
> 
- 1. 트랜잭션 모두 켜고, 쓰레드 최적화
2. OSIV 옵션 끄고 상세하게 트랜잭션이 필요할때만 트랜잭션 어노테이션을 켜거나 propagation 이용
    - 현재 저희 프로젝트는 지연로딩 전략을 이용하고 있어 때로는 N+1 문제가 발생할 수 있습니다. 이를 위해 적절한 FetchJoin과 기본 BatchSize를 구성하였습니다. 성능상의 이점은 있을 수 있겠으나, LazyInitializationException이나 트랜잭션 관리가 어려운 경우 오히려 성능 저하나 data integrity 문제가 발생할 수 있어 일단은 효율적인 개발 진행을 위해 모든 메서드에 @Transactional을 걸어주었지만, 동시접속자가 1000명일 경우 jmeter기준 latency가 30000ms까지 증가하다가 hikaripool에서 커넥션이 말랐다는 오류가 발생합니다.  이를 해결하기 위해서는 다음과 같은 방향성이 필요합니다.
        
        ```
        1. pool size 늘리기
        2. connection timeout 늘리기
        3. transaction의 적절한 사용
        ```
        
    - 1, 2번을 적용하였을 경우 해당 오류는 나아졌으나 임시방편이라고 생각하여 트랜잭션이 꼭 필요한 순간만 트랜잭션을 적용시키려고 합니다. 그러나 모든 API에 대해 확인절차를 거쳐야 하기때문에 조금은 후순위로 미루고 다른 작업을 진행 중에 있습니다.
    

<aside>
🔴 CI 구성 실패

</aside>

> 디렉토리 안에 Build 파일이 들어있어 인식하지 못해 Build 실패
> 
- 1. Build파일 이동
2. 레포 다시 만들기
    - 해당문제는 깃허브에서 Repository를 만들고 디렉토리를 만들어서 그 안에서 시작해서 action이 인식하지 못해 발생한 문제로, build.gradle을 디렉토리 밖으로 이동시 작동하나, application.yml의 위치를 따로 지정해줘도 제대로 인식하지 못해 Repository를 다시 만들어 적용시켜 해결했습니다.
        
        ![스크린샷 2023-03-28 오전 11.18.23.png](%E1%84%84%E1%85%A1%E1%86%AF%E1%84%81%E1%85%A1%E1%86%A8%20DDAL-GGAK%205d44eae726a0475bbe78e467482db4fd/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2023-03-28_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%258C%25E1%2585%25A5%25E1%2586%25AB_11.18.23.png)
        

<aside>
🔴 CodeDeploy - SQL 오류

</aside>

> 코드 자동배포화를 하면서 생긴 오류
> 
1. 
    
    ```
    HikariPool-1 - Exception during pool initialization. com.mysql.cj.jdbc.exceptions.CommunicationsException: Communications link failure
    ```
    
    - 

<aside>
🔴 로드 밸런서

</aside>

> Health Check : Health check path 404 오류 발생하여 https로 리다이렉트가 되지 않음
> 
- 1. Health check path 번호 or 주소 변경
2. Spring Security Filer 예외처리
    - Health Check : Spring Security로 인해 체크하고자 했던 /health 가 나오지 않아 Health check path가 존재하지 않거나 잘못된 경로를 가리키고 있어 404 오류가 계속해서 발생하여 https로 리다이렉트가 되지 않아 `SecurityFilterChain` 에 접근가능하도록 /health 허용하였습니다.

<aside>
🔴 SSL 인증서 - 호스팅 영역

</aside>

> 502 bad gateway
> 
- 1.  SSL 인증서 다시 발급
    - Health Check를 통과 했음에도 새로 고침시 발생했다 안했다가 계속 나타났고, 다른 사람들은 접근이 되지 않아 SSL 인증서를 다시 발급받아 적용시켜 해결하였습니다.

<aside>
🔴 인스턴스 시작 실패

</aside>

> CPU가 높아져 인스턴스 상태이상 발생
> 
- 1. CloudWatch를 사용
2. 인스턴스 용량 UP
    - 주기적으로 관찰한 결과 메모리의 양이 60~70에서 번갈아가면서 나타났으며, 인스턴스 용량을 t2.medium 업그레이드 시킨 후 문제가 발생하지 않았고, 주기적으로 관찰 하고 있습니다.

<aside>
🔴 보안 문제 & 서버운영 문제

</aside>

> 서버의 보완 문제 proxy를 사용할지에 여부  
codedeploy만 사용시 업데이트 시 멈춤 현상
> 
- 1. proxy를 따로 설정
2. nginx를 설정하여 proxy를 함께 가동
    - nginx를 선택하게 된 원인이기도 합니다.
    - 내부에서 Spring Security로 보완을 했다고 하더라도 서버에서 따로 처리가 필요했고, 기존 codedelpoy만 사용해서 업데이트시 서버의 멈춤 현상을 막기 위해 선택하게 되었습니다.
        
        ![스크린샷 2023-04-17 오전 10.30.31.png](%E1%84%84%E1%85%A1%E1%86%AF%E1%84%81%E1%85%A1%E1%86%A8%20DDAL-GGAK%205d44eae726a0475bbe78e467482db4fd/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2023-04-17_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%258C%25E1%2585%25A5%25E1%2586%25AB_10.30.31.png)
        
        ![스크린샷 2023-04-17 오전 10.31.13.png](%E1%84%84%E1%85%A1%E1%86%AF%E1%84%81%E1%85%A1%E1%86%A8%20DDAL-GGAK%205d44eae726a0475bbe78e467482db4fd/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2023-04-17_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%258C%25E1%2585%25A5%25E1%2586%25AB_10.31.13.png)
        

<aside>
🔴 nginx 스크립트 실행 문제

</aside>

> 로컬과 서버 직접 테스트를 통해 작동 확인 후 Github action에 적용시켜 실행시켰지만, 인스턴스 주소를 인식하지 못하거나 8081과 8082로 넘어가는 과정에서 8082에 set2가 나타나지 않아 넘어가지 않은 문제발생
> 
- 1.  스크립트에 직접 입력
2. Spring Security Filer 예외처리
3. 설정 test controller 변경
    - 계속해서 상태체크를 하고 있는 중 인스턴스 주소를 깃허브 액션 비밀키에 넣어 실행시켰지만, [http://8081로](http://8081로) 인식하는 상태가 계속되어 스트립트에 직접 입력하고 서버에 넣어두었습니다.
    - Securityconfig에 업데이트가 되지 않아 발생했던 문제로 Spring Security Filer 예외처리를 변경해주어 실행 확인했습니다.
        
        ![스크린샷 2023-04-11 오후 4.54.32.png](%E1%84%84%E1%85%A1%E1%86%AF%E1%84%81%E1%85%A1%E1%86%A8%20DDAL-GGAK%205d44eae726a0475bbe78e467482db4fd/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2023-04-11_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%2592%25E1%2585%25AE_4.54.32.png)
        
        ![스크린샷 2023-04-11 오후 4.54.38.png](%E1%84%84%E1%85%A1%E1%86%AF%E1%84%81%E1%85%A1%E1%86%A8%20DDAL-GGAK%205d44eae726a0475bbe78e467482db4fd/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2023-04-11_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%2592%25E1%2585%25AE_4.54.38.png)
        

<aside>
🔴 로그아웃

</aside>

> Method 사용과 사용자 확인 절차 확인 여부
> 
- 1. GET method 사용
2. token값 유효성 검사
    - 기존 토큰을 확인해서 인증되지 않은 사용자가 다른 사용자의 계정을 로그아웃하는 등의 보안 위협 방지
    - 단순 GET 요청으로 동작할 수 있지만 prefetch라는 기술로 인해 부작용이 생길 수 있습니다.
    - prefetch = 사용자를 위해 GET 링크를 미리 가져와 사용자가 해당 링크를 클릭했을 때 즉시 제공함으로써 페이지 로딩 시간을 줄이는 프로세스입니다.
    - 페이지에서 링크를 미리 가져오려고 시도하는 도중에 사용자가 로그아웃을 누르지 않아도 로그아웃이 될 수 있다. 그래서 POST 메서드를 사용했습니다.
    

<aside>
🔴 Redis

</aside>

> Redis Repository / Redis Template에 대한 고민
> 
- Redis Repository
    - 예상한 기능에서는 AccessToken, RefreshToken관리와 email 인증코드 관리기능이 있었다. 해당 내용은 Redis Repository만으로도 충분한 구현이 가능하고 추후 RedisTemplate을 추가한다고 해도 확장성이 크게 떨어지지 않을 것이라 판단해서 RedisRepository를 적용했다.
    - 적용 중에 있었던 에러사항은 아래와 같다.
    Redis 에 사용할 객체의 `@Id` 어노테이션 (JPA 에서 사용하는 `@Id` 를 임포트 X)
    `javax.persistence.Id` 대신 `org.springframework.data.annotation.Id` 을 임포트 할 것
    Redis는 ID를 자동 부여하는 기능을 지원하지 않는다.
    RedisRepoitory는 CRUD repository를 상속하기에 CURD repository가 지원하는 기능만 사용 가능하다.

---
# 👥담당


|    | 이름   | 담당                                                                                                                                                           | 상세                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| --- | ------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| FE     | 김대현 | 개발 전반 의사결정 및 환경 셋팅. 기능 개발.<br> 고도화 및 리팩터링. 재사용성이 높고 변화에 강한 구조 구현                                                      | - convention Rule 수립 및 셋팅 : commitConvention(husky), CodeConvention(ESLint + Prettier + Airbnb)<br> - 개발 전반적인 의사결정 : 소프트코딩 전략, 형상관리 전략, 폴더 구분 및 개발 방향성 확립<br> - 커스텀 Axios 객체 구현<br> - HTTP 프로토콜 통신 errorHandler 구현<br> - 비인증 유저의 접속을 차단하는 AuthRoute 구현<br> - routes 객체의 field값에 따라 optional하게 렌더링되는 Router 및 컴포넌트 구현<br> - theme 객체와 layout 상수 값들의 소프트코딩을 적용한 디자인 변화에 유동적인 styled-components 사용 전략<br> - 상수 객체 선언에 따른 자동 Type 생성 및<br> - BE와의 데이터 싱크로나이징, 로그인, project, task, ticket 전반<br> - 1차 완성 컴포넌트 기술 고도화 / 컴포넌트 분리 및 소프트코딩 리팩터링<br> - Login / Signup의 react-hook-form에 사용되는 type과 register 및 컴포넌트를 자동 생성 및 등록하는 커스텀 react-hook-input 구현                             |
| FE(L)  | 박지현 | login페이지,signUp페이지, setting페이지, myTicket페이지                                                                                                        | - 수립된 convention Rule 따라 코드 작성<br> - Login / Signup의 react-hook-form을 이용한 Validation 1차 적용 및 기능 구현<br> - Setting 에서 Nested Routes 적용<br> - Setting/User 에서 profile 및 닉네임 수정기능 구현<br> - Setting/ProjectSetting 에서 thumbnail 및 타이틀 수정기능 구현<br> - Setting/ProjectMember 에서 project에 참여한 멤버 관리기능 구현<br> - MyTicketPage 에서 completedTicket 잔디기능 구현                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| BE     | 박성민 | websecurity, 로그인, 로그아웃, 토큰 재발급, 회원 페이지, redis, SMTP                                                                                           | - 권한이 없는 토큰으로 접근하면 exceptionHandling을 적용시켜 401, 403에러로 핸들링 했습니다.<br> - 로그인, 로그아웃: Redis를 통한 Access Token, Refresh Token을 관리하며 토큰 만료 2분이내 활동이 있으면 자동으로 Access Token을 재발급 시켰습니다.<br> - SMTP: 이메일을 사용한 인증로직, 초대코드 발송 로직을 구현했습니다.<br> - Redis서버를 구축하고 redis 관련 설정을 했습니다. redis로 token을 관리하여 서버 부화 최소화 했습니다.<br> OAuth2를 적용시켜 google login을 구성했습니다.                                                                                                                                                                                                                                                                                                                                                                                                |
| BE(VL) | 박현아 | CI/CD를 통한 무중단 배포 서버 구축, 로드밸선싱을 이용한 리다이렉트, nginx로 변경을 통해 2개의 포트로 무중단 배포와 proxy 로 보안 높임, 티켓, 댓글 구현 및 개선 | - CI/CD 서버 구축 및 관리: GitHub Actions, Amazon S3, AWS CodeDeploy, 및 Nginx를 사용하여 무중단 배포를 가능하게 만들며, 주기적으로 테스트와 상태 점검을 수행<br> - HTTPS 연결 - Redis 서버 실행 : 비용과 용량적인 문제로 다른분 계정으로 프리티어로 따로 관리하고 있습니다.<br> - 아키텍처 설계: CI/CD 전략을 적용하여 시스템 아키텍처를 구성<br> - 이슈 트래킹, 댓글, 코드 리뷰, 리뷰 댓글, 실시간 알림 구현: 기본 기능을 완성하였으며, MVP 범위를 이슈 트래킹 및 댓글로 축소하여 상태 변경 및 관리 기능을 구현<br> - 서버 부하 최소화를 위해 적절한 트랜잭션 처리를 고려하고, Querydsl을 적용<br> - 데이터베이스 관리: 여러 서버 인스턴스를 구축하고, 각 가용 영역에 맞는 Amazon RDS 인스턴스를 연결하며, 주기적으로 데이터베이스 상태를 확인<br> - 회의 및 피드백 정리(서기), 노션 관리(서기), 프레젠테이션 자료 작성 및 준비, 서버 비용 관리(총무), 마케팅 예산 관리(총무) 등을 담당 |
| BE | 조영준 | ERD설계, Exception handling, 동시성 이슈 제어, Custom validation, Mapping framework을 통한 dto 변환로직 설계, AOP를 이용한 통신 latency 체크, dynamic query를 통한 데이터 제공, Ticket 점수와 관련된 로직 설계, infra 설계 | - ERD 설계 - Excepiton handling BindingResult를 FieldError와 함께 client에 전송함으로써 어디서 바인딩에러가 발생하였는지에 대해 명시하고, Entity 문제나 custom error에 대한 로직을 작성하였습니다.<br> - Custom validation Custom한 validator를 통해 무분별한 DB 출입을 방지하고 유효성 검사를 조금 더 자세하게 만들었습니다.<br> - Mapping framework를 통한 dto 변환로직 설계 Mapstuct를 통해 자동 매핑을 구현하여 코드의 가독성과 유지보수성을 증가시켰습니다.<br> - dynamic query를 통한 date, status별 티켓 데이터 제공 Querydsl을 이용하여 LocalDateTime 형태로 나누어져 있는 티켓들을 일별로 합산하여 사용자에게 날짜별 완료된 티켓수를 제공하고, 무한스크롤을 이용한 slice 형태의 ticket field를 반환함으로써 원하는 만큼의 데이터를 분할하여 제공하였습니다.<br> - Jmeter를 통한 부하 테스트 현재 서버에서 얼마만큼의 쓰레드를 감당할 수 있는지 등을 체크하고 latency를 파악해 2s를 상회하는 요청들은 로직을 재검토 하였습니다.<br> - ticket score와 관련된 로직 설계 linear algebra의 선형 가중 조합을 사용하여 티켓의 점수를 계산하여 태스크에서 티켓 다량발부에 대한 어뷰징을 방지하였습니다.<br> - infra 설계 slack을 이용한 logback, swagger 기능들을 활성화하여 팀원들과의 응집력을 극대화시켰습니다. |

# 👥팀원 git hub

FE

김대현 : [https://github.com/pengooseDev](https://github.com/pengooseDev)

박지현 : [https://github.com/Taffymark1](https://github.com/Taffymark1)

BE

조영준 : [https://github.com/choincnp](https://github.com/choincnp)

박현아 : [https://github.com/aihtnyc-h](https://github.com/aihtnyc-h)

박성민 : [https://github.com/seongminnnn](https://github.com/seongminnnn)
