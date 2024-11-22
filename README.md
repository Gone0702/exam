![image](https://github.com/user-attachments/assets/366ac797-d548-4090-9f19-6130a727ef2a)


# 평가 시스템

1. Event Storming
   ![image](https://github.com/user-attachments/assets/1ea42fd8-19a4-4a58-b510-45fdecc4a40d)


# 서비스 시나리오

기능적 요구사항
1. 관리자가 평가를 생성한다.
2. 학습자가 평가를 신청한다.
3. 학습자가 평가를 진행한다.
4. 평가를 완료한 학습자가 답안지를 제출한다.

비기능적 요구사항
1. 장애격리
    1. 평가 결과 기능이 수행되지 않더라도 진행되고 있는 평가에 대해서는 결과 저장이 되어야 한다. Async(event-driven), Eventual Consistenc


# 분석/설계

### 이벤트 도출
![image](https://github.com/user-attachments/assets/987c6eb4-5fba-4c0e-a689-83c241daaee5)


### 부적격 이벤트 탈락
![image](https://github.com/user-attachments/assets/e355726f-bcc1-4618-b156-cdaa88e95566)


### 액터, 커맨드 부착하여 읽기 좋게
![image](https://github.com/user-attachments/assets/4eb0678c-893f-4529-9f7c-3abbfd8a4dec)


### 어그리게잇으로 묶기
![image](https://github.com/user-attachments/assets/b8102fb9-37de-42d5-97ca-7c4070749851)


### 바운디드 컨텍스트로 묶기

![image](https://github.com/user-attachments/assets/dde563c1-c9cb-42b8-b0e0-a71a675b5e48)


### 완성된 모형

![image](https://github.com/user-attachments/assets/1ea42fd8-19a4-4a58-b510-45fdecc4a40d)


### 1차 완성본에 대한 기능적/비기능적 요구사항을 커버하는지 검증

<img width="498" alt="image" src="https://github.com/user-attachments/assets/3c3f4365-024e-4da2-833a-8162e0487dae">

    - 학습자가 평가를 신청한다. (ok)
    - 학습자가 신청된 평가를 응시한다. (ok)
    - 학습자가 평가 응시 후 답안을 제출한다. (ok)
    - 학습자가 평가 결과를 조회한다. (ok)


# 구현:

```
cd create
mvn spring-boot:run

cd request
mvn spring-boot:run 

cd answer
mvn spring-boot:run  

cd result
mvn spring-boot:run
```


