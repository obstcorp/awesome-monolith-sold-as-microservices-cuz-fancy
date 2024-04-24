# Define variables
SPINNER = / - \\ \|
ART_FILE = asciiart.txt
SPIN_DURATION := 120  # Spin duration in seconds
SPIN_INTERVAL := 0.1 # Spin interval in seconds

# Total iterations for the spinner to run for SPIN_DURATION
# / SPIN_INTERVAL / number of characters in SPINNER
TOTAL_ITERATIONS := $(shell echo "scale=0; $(SPIN_DURATION) / $(SPIN_INTERVAL) / 4" | bc)

# Define targets and their actions
run:
	@cat $(ART_FILE)
	@printf "Compiling "
	@idx=1; \
	for i in `seq 1 $(TOTAL_ITERATIONS)`; do \
		printf "\b$${SPINNER:$${idx}%4:1}"; \
		sleep $(SPIN_INTERVAL); \
		idx=$$((idx+1)); \
	done
	@mvn spring-boot:run