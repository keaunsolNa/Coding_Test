# [Bronze III] Brexiting and Brentering - 25246 

[문제 링크](https://www.acmicpc.net/problem/25246) 

### 성능 요약

메모리: 14172 KB, 시간: 132 ms

### 분류

구현, 문자열

### 제출 일자

2024년 1월 31일 08:31:37

### 문제 설명

<p>This is not a problem about Brexit. Or at least not about the social or economic implications of Brexit. Instead, we -- the Grammatical Correctness Policing Committee (GCPC) -- want to focus exclusively on the linguistic challenges posed by this combination of the words "Britain" and the noun "exit". We are very concerned about the ambiguity of this construction. When using the term Brexit, it is not clear at all whether it is supposed to refer to to Great Britain or Brazil. Or perhaps Bremen leaving the Bundesliga.</p>

<p>And it's not just Brexit, you might also have heard of "Megxit" (having to do something with the British royal family) and similar constructions.</p>

<p>Looking ahead, we want to avoid a similar disaster in the future. For that purpose we, as a European agency with German roots, would like to implement some standardisation. We have focused on the act of entering. If a subject (a person, an organization, a plant, etc. ) enters (or possibly reenters) something, our leading linguistic scientists suggest we look for the last vowel in the subjects name (<code>a</code>, <code>e</code>, <code>i</code>, <code>o</code> and <code>u</code> are considered vowels). We cut off any letters after this last vowel and add the ending <code>ntry</code> instead. Here are some examples:</p>

<ul>
	<li>If Britain were to reenter the European Union, we would call it "Britaintry"<sup>1</sup>.</li>
	<li>If Canada were to enter, say, the NWERC region, that would be a "Canadantry".</li>
	<li>And whenever a person named "Paul" enters someplace, we clearly have a "Pauntry".</li>
</ul>

<p>Given a subject's name, determine how the act of entering should be called for this subject.</p>

<hr>
<p><sup>1</sup>We are convinced this is going to happen, because Brexit must have been such a joy for the people of Britain (otherwise, their political leaders certainly would not have taken this step). When something brings so much joy to everybody, you want to repeat it. But to repeat Brexit, there has to be Britaintry first!</p>

### 입력 

 <p>The input consists of:</p>

<ul>
	<li>One line with a string <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D460 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>s</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$s$</span></mjx-container> (<mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-texatom space="4" texclass="ORD"><mjx-mo class="mjx-n"><mjx-c class="mjx-c7C"></mjx-c></mjx-mo></mjx-texatom><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D460 TEX-I"></mjx-c></mjx-mi><mjx-texatom texclass="ORD"><mjx-mo class="mjx-n"><mjx-c class="mjx-c7C"></mjx-c></mjx-mo></mjx-texatom><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c35"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><mo>≤</mo><mrow data-mjx-texclass="ORD"><mo stretchy="false">|</mo></mrow><mi>s</mi><mrow data-mjx-texclass="ORD"><mo stretchy="false">|</mo></mrow><mo>≤</mo><mn>50</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$1 \le |s| \le 50$</span></mjx-container>), the name of the subject. This name can refer to any person, animal, country, organization, etc.</li>
</ul>

<p>All characters in <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D460 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>s</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$s$</span></mjx-container> are uppercase letters <code>A</code>-<code>Z</code> or lowercase letters <code>a</code>-<code>z</code>. The first letter may be uppercase or lowercase, all other letters are lowercase. <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D460 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>s</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$s$</span></mjx-container> will contain at least one lowercase vowel.</p>

### 출력 

 <p>Output one single word, the term for the act of the subject entering.</p>

