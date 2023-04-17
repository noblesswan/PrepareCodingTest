# [level 0] 배열 두배 만들기 - 120809 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120809?language=java) 

### 성능 요약

메모리: 87.8 MB, 시간: 0.03 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

Empty

### 문제 설명

<p>정수 배열 <code>numbers</code>가 매개변수로 주어집니다. <code>numbers</code>의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>-10,000 ≤ <code>numbers</code>의 원소 ≤ 10,000</li>
<li>1 ≤ <code>numbers</code>의 길이 ≤ 1,000</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>numbers</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>[1, 2, 3, 4, 5]</td>
<td>[2, 4, 6, 8, 10]</td>
</tr>
<tr>
<td>[1, 2, 100, -99, 1, 2, 3]</td>
<td>[2, 4, 200, -198, 2, 4, 6]</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>[1, 2, 3, 4, 5]의 각 원소에 두배를 한 배열 [2, 4, 6, 8, 10]을 return합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>[1, 2, 100, -99, 1, 2, 3]의 각 원소에 두배를 한 배열 [2, 4, 200, -198, 2, 4, 6]을 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges

이 코드는 Java로 작성된 배열 안에 있는 각각의 숫자를 2배씩 곱하여 새로운 배열을 반환하는 함수를 구현한 것입니다.

이 함수는 solution(int[] numbers)라는 이름을 가지며, 파라미터로는 int[] 형태의 numbers 배열이 주어집니다. 
함수 내부에서는 먼저 동일한 길이를 가진 새로운 배열 answer를 선언하고, 
numbers 배열의 각 요소를 2배씩 곱하여 answer 배열의 각 요소에 대입합니다. 
마지막으로 answer 배열을 반환합니다.

이 함수는 for 루프를 사용하여 numbers 배열의 길이만큼 반복하며, 
각 반복에서는 i번째 요소를 가져와서 2배씩 곱한 결과를 answer 배열의 i번째 요소에 대입합니다.

예를 들어, [1, 2, 3]이라는 배열이 파라미터로 주어진다면, 
함수는 [2, 4, 6]이라는 배열을 반환합니다.
