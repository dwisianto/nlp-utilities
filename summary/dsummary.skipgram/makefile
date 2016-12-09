
all:
	@echo make bld
	@echo make cln

bld:
	gradle build

cln:
	find ./ -name "*~" -exec rm {} \;
	gradle clean
	gradle cleanEclipse

cln-all: cln
	rm -rf bin
	rm -rf build
	rm -rf .gradle
	rm -rf .settings

ecl:
	gradle eclipse

