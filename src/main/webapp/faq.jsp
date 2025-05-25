<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- FAQ Section -->
<section class="py-5" id="faq">
    <div class="container">
        <h2 class="text-center text-danger mb-4" style="font-size: 2.5rem; font-weight: bold;">Frequently Asked Questions</h2>
        <p class="text-center text-muted mb-5" style="font-size: 1.2rem;">Find answers to common questions about blood donation.</p>

        <div class="accordion" id="faqAccordion">
            <!-- FAQ 1 -->
            <div class="accordion-item">
                <h5 class="accordion-header" id="headingOne">
                    <button class="accordion-button fw-bold" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne" style="font-size: 1.4rem;">
                        Who can donate blood?
                    </button>
                </h5>
                <div id="collapseOne" class="accordion-collapse collapse show" aria-labelledby="headingOne" data-bs-parent="#faqAccordion">
                    <div class="accordion-body" style="font-size: 1.2rem; color: #333;">
                        Most healthy individuals between the ages of 18-65, weighing at least 50 kg, can donate blood. Check with your local blood bank for eligibility criteria.
                    </div>
                </div>
            </div>

            <!-- FAQ 2 -->
            <div class="accordion-item">
                <h2 class="accordion-header" id="headingTwo">
                    <button class="accordion-button collapsed fw-bold" type="button" data-bs-toggle="collapse" data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo" style="font-size: 1.4rem;">
                        How often can I donate blood?
                    </button>
                </h2>
                <div id="collapseTwo" class="accordion-collapse collapse" aria-labelledby="headingTwo" data-bs-parent="#faqAccordion">
                    <div class="accordion-body" style="font-size: 1.2rem; color: #333;">
                        You can donate whole blood every 12 weeks (for men) and every 16 weeks (for women). Plasma and platelets can be donated more frequently.
                    </div>
                </div>
            </div>

            <!-- FAQ 3 -->
            <div class="accordion-item">
                <h2 class="accordion-header" id="headingThree">
                    <button class="accordion-button collapsed fw-bold" type="button" data-bs-toggle="collapse" data-bs-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree" style="font-size: 1.4rem;">
                        Is blood donation safe?
                    </button>
                </h2>
                <div id="collapseThree" class="accordion-collapse collapse" aria-labelledby="headingThree" data-bs-parent="#faqAccordion">
                    <div class="accordion-body" style="font-size: 1.2rem; color: #333;">
                        Yes! Blood donation is completely safe. A sterile needle is used only once for each donor and then discarded.
                    </div>
                </div>
            </div>

            <!-- FAQ 4 -->
            <div class="accordion-item">
                <h2 class="accordion-header" id="headingFour">
                    <button class="accordion-button collapsed fw-bold" type="button" data-bs-toggle="collapse" data-bs-target="#collapseFour" aria-expanded="false" aria-controls="collapseFour" style="font-size: 1.4rem;">
                        Will donating blood make me weak?
                    </button>
                </h2>
                <div id="collapseFour" class="accordion-collapse collapse" aria-labelledby="headingFour" data-bs-parent="#faqAccordion">
                    <div class="accordion-body" style="font-size: 1.2rem; color: #333;">
                        No, your body will replace the donated blood within a few weeks. Make sure to drink plenty of fluids and eat well after donation.
                    </div>
                </div>
            </div>

            <!-- FAQ 5 -->
            <div class="accordion-item">
                <h2 class="accordion-header" id="headingFive">
                    <button class="accordion-button collapsed fw-bold" type="button" data-bs-toggle="collapse" data-bs-target="#collapseFive" aria-expanded="false" aria-controls="collapseFive" style="font-size: 1.4rem;">
                        Can I donate if I have a tattoo or piercing?
                    </button>
                </h2>
                <div id="collapseFive" class="accordion-collapse collapse" aria-labelledby="headingFive" data-bs-parent="#faqAccordion">
                    <div class="accordion-body" style="font-size: 1.2rem; color: #333;">
                        If you have had a tattoo or piercing recently, you may need to wait at least 6-12 months before donating blood. Check with your local blood bank for details.
                    </div>
                </div>
            </div>

            <!-- FAQ 6 -->
            <div class="accordion-item">
                <h2 class="accordion-header" id="headingSix">
                    <button class="accordion-button collapsed fw-bold" type="button" data-bs-toggle="collapse" data-bs-target="#collapseSix" aria-expanded="false" aria-controls="collapseSix" style="font-size: 1.4rem;">
                        How long does the blood donation process take?
                    </button>
                </h2>
                <div id="collapseSix" class="accordion-collapse collapse" aria-labelledby="headingSix" data-bs-parent="#faqAccordion">
                    <div class="accordion-body" style="font-size: 1.2rem; color: #333;">
                        The entire process, including registration, health check, donation, and rest, takes about 45-60 minutes. The actual blood donation takes only 10-15 minutes.
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>