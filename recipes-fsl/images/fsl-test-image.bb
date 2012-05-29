DESCRIPTION = "Image with a minimal environemnt and test utilities \
to be used by BSP developers."

IMAGE_INSTALL = "task-base ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE = "8192"

# remove not needed ipkg informations
ROOTFS_POSTPROCESS_COMMAND += "remove_packaging_data_files ; "

IMAGE_INSTALL += " \
    gstreamer \
    gst-meta-video \
    gst-meta-audio \
    gst-fsl-plugin \
"