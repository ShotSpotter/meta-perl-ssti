SUMMARY = "Scalar::Util"
DESCRIPTION = "Scalar::Util - A selection of general-utility scalar subroutines"

HOMEPAGE = "https://metacpan.org/pod/Scalar::Util"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"

LIC_FILES_CHKSUM = "file://README;md5=c0ed8d34eaf984d0fb0b1becc3c26f93"
SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-${PV}.tar.gz \
"

SRC_URI[md5sum] = "7988f5111e33ba47e175cf3e86b0d93f"
SRC_URI[sha256sum] = "4d2bdc1c72a7bc4d69d6a5cc85bc7566497c3b183c6175b832784329d58feb4b"

S = "${WORKDIR}/Scalar-List-Utils-${PV}"

inherit cpan
