<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Contact Us Section -->
<section class="py-5 bg-light  " id="contact">
    <div class="container">
        <h2 class="text-center text-danger mb-4">Contact Us</h2>
        <p class="text-center text-muted mb-5">Have questions? Feel free to reach out to us.</p>

        <div class="row contact">
            <!-- Contact Form -->
            <div class="col-md-6">
                <div class="card border-0 shadow-lg p-4">
                    <h4 class="text-center text-danger mb-3">Get in Touch</h4>
                    
                    
                    <form method="post" action="ContactController">
                        <div class="mb-3">
                            <label for="name" class="form-label">Full Name</label>
                            <input type="text" class="form-control" name="name" placeholder="Enter your name">
                        </div>
                        <div class="mb-3">
                            <label for="email" class="form-label">Email Address</label>
                            <input type="email" class="form-control" name="email" placeholder="Enter your email">
                        </div>
                        <div class="mb-3">
                            <label for="message" class="form-label">Your Message</label>
                            <textarea class="form-control" name="message" rows="4" placeholder="Enter your message"></textarea>
                        </div>
                        <button type="submit" class="btn btn-danger w-100">Send Message</button>
                    </form>
                </div>
            </div>

            <!-- Contact Info -->
            <div class="col-md-6">
                <div class="card border-0 shadow-lg p-4 h-100">
                    <h4 class="text-center text-danger mb-3">Contact Information</h4>
                    <ul class="list-unstyled">
                        <li class="mb-3"><strong>📍 Address:</strong> Ahmednagar, Maharashtra, India</li>
                        <li class="mb-3"><strong>📞 Phone:</strong> +91 9876543210</li>
                        <li class="mb-3"><strong>✉ Email:</strong> contact@bloodbank.com</li>
                        <li><strong>🕒 Working Hours:</strong> Mon-Sat: 9 AM - 6 PM</li>
                    </ul>
                </div>
            </div>
        </div>
<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3769.9865269671245!2d74.74076601070414!3d19.108246982028362!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bdcb167d81aaa97%3A0xefc3085bd11eb7f2!2sSaideep%20Hospital%20Cardiology!5e0!3m2!1sen!2sin!4v1741176760180!5m2!1sen!2sin" width="100%" height="400" style="border:0;" allowfullscreen="" class="mt-5 border border-1 border-black rounded-4 " loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
        </div>
    </div>
</section>
</body>
</html>