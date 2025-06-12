package school.hei.wc.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import school.hei.wc.conf.FacadeIT;

class WCControllerIT extends FacadeIT {
  @Autowired WCController wcController;

  @Test
  void fmaurica_website_is_counted_corrected() throws MalformedURLException {
    assertEquals(
        "[to=24, the=16, a=11, i=11, in=10, of=8, is=7, on=7, for=6, he=5, and=5, be=4, software=4,"
            + " it=4, that=4, my=4, point=4, floating=4, they=3, as=3, are=3, bug=3, school=3,"
            + " this=3, not=3, me=3, verification=3, about=2, science=2, much=2, hand=2, kids=2,"
            + " c=2, one=2, selfie=2, talk=2, those=2, termination=2, which=2, image=2, invited=2,"
            + " hours=2, engineer=2, 2019=2, 2014=2, hue=2, time=2, mark=2, madagascar=2, have=2,"
            + " facebook=2, phd=2, imagemagick=2, his=2, most=2, were=2, who=2, code=2,"
            + " university=2, value=2, or=2, computations=2, reason=1, been=1, discipline=1,"
            + " teenagers=1, introduced=1, character=1, 475=1, worked=1, java=1, music=1, would=1,"
            + " horrible=1, akamasoa=1, postdoctoral=1, poverty=1, ten=1, events=1, you=1,"
            + " energy=1, edit=1, pleasure=1, expected=1, want=1, opportunity=1, them=1, then=1,"
            + " analysis=1, whose=1, at=1, wanted=1, atomic=1, 7=1, processing=1, stops=1,"
            + " programs=1, conditions=1, discovered=1, infinite=1, participated=1, guarantee=1,"
            + " association=1, believe=1, two=1, how=1, bugs=1, systems=1, defense=1, managed=1,"
            + " by=1, commission=1, where=1, free=1, so=1, escape=1, musician=1, incorrect=1,"
            + " manages=1, possible=1, people=1, actually=1, such=1, entering=1, s=1, absolute=1,"
            + " days=1, eurodecision=1, operation=1, story=1, country=1, attend=1, had=1, do=1,"
            + " microsoft=1, fortunately=1, view=1, post=1, loop=1, contact=1, has=1, up=1, last=1,"
            + " need=1, might=1, baroque=1, degree=1, esiroi=1, longer=1, mathc2=1, playing=1,"
            + " page=1, frama=1, hesitate=1, little=1, however=1, doing=1, classes=1, non=1,"
            + " disaster=1, now=1, wants=1, just=1, cases=1, dramatic=1, was=1, yet=1, modify=1,"
            + " 2018=1, 2017=1, service=1, there=1, injection=1, taking=1, fonenantsoa=1, tries=1,"
            + " very=1, education=1, faulty=1, during=1, bit=1, three=1, when=1, division=1,"
            + " responding=1, optimization=1, thesis=1, if=1, french=1, order=1, azure=1, still=1,"
            + " researcher=1, goal=1, educating=1, intel=1, culprit=1, fail=1, million=1, even=1,"
            + " upv=1, terminate=1, completely=1, wait=1, other=1, matter=1, tools=1, summer=1,"
            + " computer=1, 1994=1, julia=1, get=1, assure=1, may=1, caused=1, more=1,"
            + " persevered=1, great=1, lead=1, rli=1, computation=1, help=1, january=1, ended=1,"
            + " maurica=1, before=1, use=1, networking=1, harmful=1, high=1, analyzers=1,"
            + " pianist=1, than=1, modified=1, retouch=1, from=1, terrible=1, comforts=1, likes=1,"
            + " new=1, took=1, already=1, island=1, malagasy=1, fictional=1, runtime=1, history=1,"
            + " interrupted=1, done=1, tool=1, defeats=1, keep=1, try=1, present=1, errors=1,"
            + " parents=1, mathematics=1, line=1, why=1, storage=1, can=1, invulnerability=1,"
            + " cost=1, spent=1, decides=1, implementation=1, homeless=1, say=1, voluntarily=1,"
            + " chooses=1, ultimately=1, command=1, fans=1, reunion=1, until=1]",
        wcController.wc("https://lim.univ-reunion.fr/staff/fmaurica/"));
  }
}
